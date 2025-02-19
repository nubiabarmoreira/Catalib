package com.zup.CataLib.dtos;

import com.zup.CataLib.models.BookEntity;

public record BookResponseDTO(Long id, String title, String author, String category,
                              int yearPublication, int stock, String description) {

    public static BookResponseDTO entityToDTO (BookEntity book) {
        return new BookResponseDTO(
               book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(),
                book.getYearPublication(), book.getStock(), book.getDescripton());
    }


}
