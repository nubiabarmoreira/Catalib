package com.zup.CataLib.dtos;

import com.zup.CataLib.models.BookEntity;

public record BookRequestDTO(String title, String author, String category,
                             int yearPublication, int stock, String description) {

    public BookEntity dtoToEntity() {
        BookEntity newBook = new BookEntity();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setCategory(category);
        newBook.setYearPublication(yearPublication);
        newBook.setStock(stock);
        newBook.setDescripton(description);

        return newBook;
    }
}
