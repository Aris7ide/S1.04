package com.main;

import com.service.Service;
import com.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        ConsoleUI ui = new ConsoleUI(service);

        ConsoleUI.start();

    }
}
