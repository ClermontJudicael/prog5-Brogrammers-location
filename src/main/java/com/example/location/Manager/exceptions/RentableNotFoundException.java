package com.example.location.Manager.exceptions;

public class RentableNotFoundException extends RuntimeException {
    public RentableNotFoundException(String id) {
        super("Rentable with id '" + id + "' not found");
    }
}