package com.exceptions;

public class NoBookInList extends RuntimeException {
    public NoBookInList(String message) {
        super(message);
    }
}
