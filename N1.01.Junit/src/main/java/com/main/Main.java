package com.main;

import com.service.BookService;
import com.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();
        ConsoleUI ui = new ConsoleUI(service);

        ui.start();

    }
}
