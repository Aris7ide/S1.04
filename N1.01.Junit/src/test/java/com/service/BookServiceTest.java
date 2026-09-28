package com.service;

import com.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private BookService bookService;

    Book book1;
    Book book2;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
        book1 = new Book("Zelda");
        book2 = new Book("Tarzan");
        bookService.getListBooks().put(1,book1);
        bookService.getListBooks().put(2,book2);
    }

    @Test
    @DisplayName("La colleciòn no està vacia")
    void shouldNotBeNull() {
        assertNotNull(bookService.getListBooks(), "La clase no puede estar vacia");
    }

    @Test
    @DisplayName("El .size() de la collecìòn es correcto")
    void shouldSizeBeCorrect() {
        assertEquals(2,bookService.getListBooks().size());
    }

    @Test
    @DisplayName("La posiciòn de los elementos es correcta")
    void shouldPositionBeRight() {
        assertEquals("Zelda", bookService.getListBooks().get(1).getName());
        assertEquals("Tarzan", bookService.getListBooks().get(2).getName());
    }

    @Test
    @DisplayName("Los libros se enseñan correctamente con la posiciòn")
    void shouldBookBeInTheRightPosition() {
        bookService.getListBooks().put(10,new Book("Sandokan"));
        Book bookFound = bookService.getListBooks().get(10);
        assertEquals("Sandokan", bookFound.getName());
    }

    @Test
    @DisplayName("Los libros se añaden correctamente")
    void CheckCorrectModification() {

        assertEquals(2,bookService.getListBooks().size());

        Book book = new Book("Sandokan");
        int position = 23;
        bookService.getListBooks().put(position,book);

        assertTrue(bookService.getListBooks().containsKey(position));
        assertEquals(book,bookService.getListBooks().get(position));
        assertEquals(3,bookService.getListBooks().size());
    }

    @Test
    @DisplayName("Los libros se eliminan correctamente")
    void CheckRemoving() {
        assertEquals(2,bookService.getListBooks().size());

        bookService.getListBooks().values().removeIf(book -> book.getName().equalsIgnoreCase("Zelda"));

        assertEquals(1, bookService.getListBooks().size());
    }

    @Test
    @DisplayName("Los libros se ordenan en orden alfabético")
    void CheckOrderAZ() {
        bookService.getListBooks().put(3,new Book("El árbol"));
        bookService.getListBooks().put(4,new Book("Hercules"));

        List<Book> bookListAZ = bookService.booksAZ();

        assertEquals("El árbol", bookListAZ.getFirst().getName());
        assertEquals("Zelda", bookListAZ.getLast().getName());
    }

    @Test
    @DisplayName("No se permiten duplicados")
    void noDoubles() {
        assertEquals(2,bookService.getListBooks().size());

        bookService.getListBooks().put(1,new Book("Zelda"));

        assertEquals(2, bookService.getListBooks().size());
    }

}