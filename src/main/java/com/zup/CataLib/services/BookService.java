package com.zup.CataLib.services;

import com.zup.CataLib.dtos.BookRequestDTO;
import com.zup.CataLib.dtos.BookResponseDTO;

public interface BookService {
    BookResponseDTO registerBookService(BookRequestDTO newBook);
}
