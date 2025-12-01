package com.example.location.Manager.exceptions;

public class DuplicateRentableException extends RuntimeException {
  public DuplicateRentableException(String id) {
    super("Rentable with id '" + id + "' already exists");
  }
}
