package com.service;

import com.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void CollectionNotNull() {
        BookService bookService = new BookService();
        assertNotNull(bookService.getListBooks(), "La clase no puede estar vacia");
    }

    @Test
    void CollectionSizeCorrect() {
        BookService bookService = new BookService();
        bookService.getListBooks().put(1,new Book("Zelda"));
        bookService.getListBooks().put(2,new Book("Tarzan"));
        assertEquals(2,bookService.getListBooks().size());
    }

    @Test
    void PositionBookIsCorrect() {
        BookService bookService = new BookService();
        Book book1 = new Book("Zelda");
        Book book2 = new Book("Tarzan");
        bookService.getListBooks().put(1,book1);
        bookService.getListBooks().put(2,book2);
        assertEquals("Zelda", bookService.getListBooks().get(1).getName());
        assertEquals("Tarzan", bookService.getListBooks().get(2).getName());
    }

    @Test
    void showBookByPosition() {
        BookService bookService = new BookService();
        Book book1 = new Book("Zelda");
        bookService.getListBooks().put(10,book1);
        Book bookFound = bookService.getListBooks().get(10);
        assertEquals("Zelda", bookFound.getName());
    }
}