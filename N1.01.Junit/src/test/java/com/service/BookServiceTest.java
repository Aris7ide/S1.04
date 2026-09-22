package com.service;

import com.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private BookService bookService;

    Book book1 = new Book("Zelda");
    Book book2 = new Book("Tarzan");



    @BeforeEach
    void setUp() {
        bookService = new BookService();
        bookService.getListBooks().put(1,book1);
        bookService.getListBooks().put(2,book2);
    }

    @Test
    void CollectionNotNull() {
        assertNotNull(bookService.getListBooks(), "La clase no puede estar vacia");
    }

    @Test
    void CollectionSizeCorrect() {
        assertEquals(2,bookService.getListBooks().size());
    }

    @Test
    void PositionBookIsCorrect() {
        assertEquals("Zelda", bookService.getListBooks().get(1).getName());
        assertEquals("Tarzan", bookService.getListBooks().get(2).getName());
    }

    @Test
    void ShowBookByPosition() {
        bookService.getListBooks().put(10,new Book("Sandokan"));
        Book bookFound = bookService.getListBooks().get(10);
        assertEquals("Sandokan", bookFound.getName());
    }

    @Test
    void CheckCorrectModification() {
        Book book = new Book("Sandokan");
        int position = 23;
        bookService.getListBooks().put(position,book);

        assertTrue(bookService.getListBooks().containsKey(position));
        assertEquals(book,bookService.getListBooks().get(position));
        assertEquals(3,bookService.getListBooks().size());
    }

    @Test
    void CheckRemoving() {
        int initialListSize = bookService.getListBooks().size();

        bookService.getListBooks().values().removeIf(book -> book.getName().equalsIgnoreCase("Zelda"));

        assertEquals(1, bookService.getListBooks().size());
    }

    @Test
    @DisplayName("Los libros se ordenan en orden alfabetico")
    void CheckOrderAZ() {
        bookService.getListBooks().put(3,new Book("El arbol"));
        bookService.getListBooks().put(4,new Book("Hercules"));

        List<Book> bookListAZ = bookService.booksAZ();

        assertEquals("El arbol", bookListAZ.get(0).getName());
        assertEquals("Zelda", bookListAZ.get(3).getName());
    }


}