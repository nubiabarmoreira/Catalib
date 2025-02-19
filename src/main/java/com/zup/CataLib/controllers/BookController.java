package com.zup.CataLib.controllers;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> registerBookController(@Valid @RequestBody BookRequestDTO newBook) {
        BookResponseDTO saveNewBook = bookService.registerBookService(newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveNewBook);

    }
}
