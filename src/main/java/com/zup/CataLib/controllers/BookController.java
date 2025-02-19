package com.zup.CataLib.controllers;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import com.zup.CataLib.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> registerBookController(@RequestBody BookRequestDTO newBook) {
        BookResponseDTO saveNewBook = bookService.registerBookService(newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveNewBook);

    }
    @GetMapping("/api/livros")
    public List<BookResponseDTO> listProducts(){
        return bookService.listAllBooks();
    }


}
