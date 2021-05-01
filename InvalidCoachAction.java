package com.company;

public class InvalidCoachAction extends RuntimeException {
    public InvalidCoachAction (String message) {
        super(message);
    }
}
