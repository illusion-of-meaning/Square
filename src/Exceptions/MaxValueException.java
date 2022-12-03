package Exceptions;

public class MaxValueException extends RuntimeException {
    public MaxValueException() {
    }

    public MaxValueException(String message) {
        super(message);
    }
}
