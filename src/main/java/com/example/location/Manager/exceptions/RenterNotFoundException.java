package com.example.location.Manager.exceptions;

public class RenterNotFoundException extends RuntimeException {
    public RenterNotFoundException(String name) {
        super("Renter with name '" + name + "' not found");
    }
}