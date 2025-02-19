package com.zup.CataLib.services;

import com.zup.CataLib.repositories.JPABookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private JPABookRepository jpaBookRepository;

    public void registerBookService() {

    }

    public void deleteBook(Long id) {
        if (!jpaBookRepository.existsById(id)) {
            throw new RuntimeException("book does not exist");
        }
        jpaBookRepository.deleteById(id);
    }
}
