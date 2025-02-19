package com.zup.CataLib.dtos;

import com.zup.CataLib.models.BookEntity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record BookRequestDTO(
        @NotEmpty(message = "O título não pode estar vazio")
        @NotNull(message = "O título não pode ser nulo")
        String title,
        @NotEmpty(message = "O nome do autor não pode estar vazio")
        @NotNull(message = "O nome do autor não pode ser nulo")
        String author,
        @NotEmpty(message = "A categoria pode estar vazia")
        @NotNull(message = "A categoria não pode ser nula")
        String category,
        @NotNull(message = "O ano de publicação não pode ser nulo")
        int yearPublication,
        @NotNull(message = "O estoque não pode ser nulo")
        @Min(value = 0, message = "O estoque deve ser um número inteiro maior ou igual a zero")
        int stock,
        String description) {

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
