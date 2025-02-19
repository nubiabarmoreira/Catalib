package com.zup.CataLib.services;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.models.BookEntity;
import com.zup.CataLib.repositories.JPABookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private JPABookRepository jpaBookRepository;

    public BookServiceImpl(JPABookRepository jpaBookRepository){
        this.jpaBookRepository = jpaBookRepository;
    }

    public BookResponseDTO registerBookService(BookRequestDTO newBook) {
        BookEntity newBookEntity = newBook.dtoToEntity();
        BookEntity saveNewBook = jpaBookRepository.save(newBookEntity);
        return BookResponseDTO.entityToDTO(saveNewBook);
    }

    @Override
    public List<BookResponseDTO> listAllBooks() {
        return jpaBookRepository.findAll()
                .stream()
                .map(bookEntity -> new BookResponseDTO(
                        bookEntity.getId(),
                        bookEntity.getTitle(),
                        bookEntity.getAuthor(),
                        bookEntity.getCategory(),
                        bookEntity.getYearPublication(),
                        bookEntity.getStock(),
                        bookEntity.getDescripton()
                ))
                .collect(Collectors.toList());
    }

    public void deleteBook(Long id) {
        if (!jpaBookRepository.existsById(id)) {
            throw new RuntimeException("book does not exist");
        }
        jpaBookRepository.deleteById(id);
    }

    @Override
    public BookEntity updateBook(Long id, BookRequestDTO bookRequestDTO) {
        // Busca o livro pelo ID no banco de dados
        Optional<BookEntity> optionalBook = jpaBookRepository.findById(id);

        // Verifica se o livro existe
        if (optionalBook.isEmpty()) {
            throw new RuntimeException("Livro com ID " + id + " não encontrado.");
        }


        BookEntity bookToUpdate = optionalBook.get();


        bookToUpdate.setTitle(bookRequestDTO.title());
        bookToUpdate.setAuthor(bookRequestDTO.author());
        bookToUpdate.setCategory(bookRequestDTO.category());
        bookToUpdate.setYearPublication(bookRequestDTO.yearPublication());
        bookToUpdate.setStock(bookRequestDTO.stock());
        bookToUpdate.setDescripton(bookRequestDTO.description());


        return jpaBookRepository.save(bookToUpdate);
    }
}
