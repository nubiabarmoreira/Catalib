package com.zup.CataLib.services;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.models.BookEntity;
import com.zup.CataLib.repositories.JPABookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private JPABookRepository jpaBookRepository;

    public BookResponseDTO registerBookService(BookRequestDTO newBook) {

        BookEntity newBookEntity = newBook.dtoToEntity();
        BookEntity saveNewBook = jpaBookRepository.save(newBookEntity);
        return BookResponseDTO.entityToDTO(saveNewBook);
    }
}
