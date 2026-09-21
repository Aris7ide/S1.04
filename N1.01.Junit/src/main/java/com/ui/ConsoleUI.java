package com.ui;

import com.service.BookService;

public class ConsoleUI {

    private final BookService bookService;

    public ConsoleUI(BookService bookService)  {
        this.bookService = bookService;
    }

    public void start() {

        int option = 1;
        while (option != 0) {

            option = ConsoleReader.readInt("MENU\n" +
                    "1. Añade un libro\n" +
                    "2. Todos los libros\n" +
                    "3. Dame el titulo de un libro\n" +
                    "4. Añade un libro a una posicion especifica\n" +
                    "5. Elimina un libro\n" +
                    "6. Todos los libros A-Z\n" +
                    "0. Sal");
            switch (option) {
                case 1:
                    bookService.addBook();
                    break;
                case 2:
                    bookService.showBooks();
                    break;
                case 3:
                    bookService.showBookByPosition();
                    break;
                case 4:
                    bookService.addBookByPosition();
                    break;
                case 5:
                    bookService.cancelBook();
                    break;
                case 6:
                    bookService.showBooksAZ();
                    break;
                case 0:
                    System.out.println("Adiòs");
                    break;
            }
        }
    }

}
