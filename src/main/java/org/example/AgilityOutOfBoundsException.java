package org.example;
//собственное исключение, если в опред. ситуации знач. ловкости выходит за пределы допустимого диапазона
public class AgilityOutOfBoundsException extends RuntimeException {
    public AgilityOutOfBoundsException() {
        super();
    }

    public AgilityOutOfBoundsException(String message) {
        super(message);
    }

    public AgilityOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}