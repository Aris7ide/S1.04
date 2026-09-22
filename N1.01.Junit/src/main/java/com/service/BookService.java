package com.service;

import com.exceptions.NoBookInList;
import com.model.Book;
import com.ui.ConsoleReader;

import java.util.*;

public class BookService {

    private Map<Integer,Book> listBooks = new HashMap<>();

    public void addBook() {
        String name = ConsoleReader.readString("Cual es el nombre del libro?");
        int position = listBooks.size()+1;
        listBooks.put(position,new Book(name));
        System.out.println("El libro " + name + " ha sido añadido!");
    }

    public void showBooks() {
        try {
            if (listBooks.isEmpty()) {
                throw new NoBookInList("No hay libros registrados");
            } else {
                for (Map.Entry<Integer, Book> entry : listBooks.entrySet()) {
                    Integer position = entry.getKey();
                    String name = entry.getValue().getName();
                    System.out.println(position + ": " + name);
                }
            }
        } catch (NoBookInList e) {
            System.err.println(e.getMessage());
        }
    }

    public void showBookByPosition() {
        try {
            if (listBooks.isEmpty()) {
                throw new NoBookInList("No hay libros registrados");
            } else {
                int position = ConsoleReader.readInt("Que posicion?");
                try {
                    System.out.println(listBooks.get(position));
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("El libro no existe");
                }
            }
        } catch (NoBookInList e) {
            System.err.println(e.getMessage());
        }
    }

    public void addBookByPosition() {
        int position = ConsoleReader.readInt("Que posicion");
        String name = ConsoleReader.readString("Cual es el nombre?");

        listBooks.put(position,(new Book(name)));
        System.out.println("El libro " + name + " ha sido añadido a la posiciòn " + position);
    }

    public void cancelBook() {
        try {
            if (listBooks.isEmpty()) {
                throw new NoBookInList("No hay libros registrados");
            } else {
                String name = ConsoleReader.readString("Cual es el nombre?");

                listBooks.values().removeIf(whatever -> whatever.getName().equalsIgnoreCase(name));
                System.out.println("El libro ha sido añadido");
            }
        } catch (NoBookInList e) {
            System.err.println(e.getMessage());
        }
    }

    public void showBooksAZ() {
        try {
            if (listBooks.isEmpty()) {
                throw new NoBookInList("No hay libros registrados");
            } else {
                List<Book> booksAZ = booksAZ();
                for (Book b : booksAZ) {
                    System.out.println(b.toString());
                }
            }
        } catch (NoBookInList e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Book> booksAZ() {
        List<Book> booksAZ = new ArrayList<>(listBooks.values());
        booksAZ.sort(Comparator.comparing(Book::getName));
        return booksAZ;
    }

    public Map<Integer, Book> getListBooks() {
        return listBooks;
    }
}

