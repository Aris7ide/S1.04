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
    void CollectionSizeCorrect() {
        BookService bookService = new BookService();
        BookService.getListBooks().put(1,new Book("Zelda"));
        BookService.getListBooks().put(2,new Book("Tarzan"));
        assertEquals(2,BookService.getListBooks().size());
    }
}