package org.example;

public class InvalidCharacterException extends Exception {
    public InvalidCharacterException() {
        super();
    }

    public InvalidCharacterException(String message) {
        super(message);
    }

    public InvalidCharacterException(String message, Throwable cause) {
        super(message, cause);
    }
}
