package org.example;
//собственное исключение, если в опред. ситуации знач. маны выходит за пределы допустимого диапазона
public class ManaOutOfBoundsException extends RuntimeException {
    public ManaOutOfBoundsException() {
        super();
    }

    public ManaOutOfBoundsException(String message) {
        super(message);
    }

    public ManaOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
