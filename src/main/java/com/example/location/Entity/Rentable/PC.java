package com.example.location.Entity.Rentable;

import java.util.UUID;

public record PC(String id, String model, double dailyRentalPrice) implements Rentable {

  public PC(String model, double dailyRentalPrice) {
    this(UUID.randomUUID().toString(), model, dailyRentalPrice);
  }

  @Override
  public String description() {
    return "PC: " + model;
  }
}
