package com.ui;

import com.service.BookService;

public class ConsoleUI {

    public ConsoleUI(Object obj) {
    }

    public static void start() {

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
                    BookService.addBook();
                    break;
                case 2:
                    BookService.showBooks();
                    break;
                case 3:
                    BookService.showBookByPosition();
                    break;
                case 4:
                    BookService.addBookByPosition();
                    break;
                case 5:
                    BookService.cancelBook();
                    break;
                case 6:
                    BookService.showBooksAZ();
                    break;
                case 0:
                    System.out.println("Adiòs");
                    break;
            }
        }
    }

}
