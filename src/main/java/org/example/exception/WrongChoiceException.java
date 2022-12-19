package org.example.exception;

public class WrongChoiceException extends RuntimeException{
    public WrongChoiceException(final String message) {
        super(message);
    }
}
