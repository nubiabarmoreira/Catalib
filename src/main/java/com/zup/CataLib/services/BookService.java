package com.zup.CataLib.services;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;
import java.util.List;
import com.zup.CataLib.models.BookEntity;

public interface BookService {
    void deleteBook(Long id);

    BookResponseDTO registerBookService(BookRequestDTO newBook);
    List<BookResponseDTO> listAllBooks();

    //Método para atualizar livro existente
    BookEntity updateBook (Long id, BookRequestDTO bookRequestDTO);
}
