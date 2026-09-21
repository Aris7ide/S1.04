package com.service;

import com.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void CollectionNotNull() {
        BookService bookService = new BookService();
        assertNotNull(BookService.getListBooks(), "La clase no puede estar vacia");
    }

    @Test
    void addBook() {
    }

    @Test
    void showBooks() {
    }

    @Test
    void showBookByPosition() {
    }

    @Test
    void addBookByPosition() {
    }

    @Test
    void cancelBook() {
    }

    @Test
    void showBooksAZ() {
    }
}