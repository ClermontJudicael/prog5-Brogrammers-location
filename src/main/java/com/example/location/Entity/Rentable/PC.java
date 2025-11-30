package com.example.location.Entity.Rentable;

public record PC(String id, String model, double dailyRentalPrice) implements Rentable {

  public PC(String model, double dailyRentalPrice) {
    this(java.util.UUID.randomUUID().toString(), model, dailyRentalPrice);
  }

  @Override
  public String description() {
    return "PC: " + model;
  }
}
