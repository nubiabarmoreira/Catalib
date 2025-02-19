package com.zup.CataLib.controllers;

import com.zup.CataLib.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.models.BookEntity;
import com.zup.CataLib.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    public BookServiceImpl bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> registerBookController(@RequestBody BookRequestDTO newBook) {
        BookResponseDTO saveNewBook = bookService.registerBookService(newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveNewBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookEntity> updateBook(@PathVariable Long id, @RequestBody BookRequestDTO bookRequestDTO) {
        BookEntity updateBook = bookService.updateBook(id, bookRequestDTO);
        return ResponseEntity.ok(updateBook);
    }

}
