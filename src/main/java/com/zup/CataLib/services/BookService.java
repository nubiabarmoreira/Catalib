package com.zup.CataLib.services;


import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;

public interface BookService {
    void registerBookService();
    void deleteBook(Long id);

  BookResponseDTO registerBookService(BookRequestDTO newBook);
    List<BookResponseDTO> listAllBooks();
}
