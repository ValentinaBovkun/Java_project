package org.example;
//собственное исключение, если в опред. ситуации хар-р персонажа в бою не соответствует нужному типу
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
