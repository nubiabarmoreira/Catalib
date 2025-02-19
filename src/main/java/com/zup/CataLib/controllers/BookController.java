package com.zup.CataLib.controllers;

import com.zup.CataLib.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    public BookServiceImpl bookService;

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<String> deleteBookById(@PathVariable Long id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().body("Produto deletado com sucesso!");
    }
}
