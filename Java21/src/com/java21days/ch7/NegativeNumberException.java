package com.java21days.ch7;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super();
    }
    
    public NegativeNumberException(String message) {
        super(message);
    }
}
