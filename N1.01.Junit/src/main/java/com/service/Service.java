package com.service;

import com.model.Book;
import com.ui.ConsoleReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Service {

    static Map<Integer,Book> listBooks = new HashMap<>();

    public static void addBook() {
        String name = ConsoleReader.readString("Cual es el nombre del libro?");
        int position = listBooks.size()+1;
        listBooks.put(position,new Book(name));
    }

    public static void showBooks() {
        for (Map.Entry<Integer,Book> entry : listBooks.entrySet()) {
            Integer position = entry.getKey();
            String name = entry.getValue().getName();
            System.out.println(position + ": " + name);
        }
    }

    public static void showBookByPosition() {
        int position = ConsoleReader.readInt("Que posicion?");
        try {
            System.out.println(listBooks.get(position));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("El libro no existe");
        }
    }

    public static void addBookByPosition() {
        int position = ConsoleReader.readInt("Que posicion");
        String name = ConsoleReader.readString("Cual es el nombre?");

        //listBooks.add(position,(new Book(name)));
        System.out.println("El libro " + name + " ha sido añadido a la posiciòn " + position);
    }
}

