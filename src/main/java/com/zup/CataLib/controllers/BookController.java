package com.zup.CataLib.controllers;

import com.zup.CataLib.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public BookServiceImpl bookService;

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<String> deleteBookById(@PathVariable Long id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().body("Produto deletado com sucesso!");
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
