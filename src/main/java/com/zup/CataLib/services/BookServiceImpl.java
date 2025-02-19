package com.zup.CataLib.services;


import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.models.BookEntity;
import com.zup.CataLib.repositories.JPABookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
}
