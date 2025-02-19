package com.zup.CataLib.services;

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

    public void registerBookService() {

    }

    @Override
    public List<BookResponseDTO> listAllBooks() {
        return jpaBookRepository.findAll()
                .stream()
                .map(BookResponseDTO::)
                .collect(Collectors.toList());
    }
}
