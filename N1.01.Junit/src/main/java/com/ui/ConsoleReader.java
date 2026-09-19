package com.ui;

import javax.sound.midi.SysexMessage;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            try {
                String value = scanner.nextLine();

                if (value.isEmpty()) {
                    throw new NoSuchElementException("ERROR");
                }

                return value;
            } catch (NoSuchElementException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
