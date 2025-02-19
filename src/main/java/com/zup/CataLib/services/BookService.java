package com.zup.CataLib.services;

import com.zup.CataLib.dtos.BookResponseDTO;

import java.util.List;

public interface BookService {
    void registerBookService();
    List<BookResponseDTO> listAllBooks();
}
