package com.example.location.Entity.Rentable;

import java.util.UUID;

public record Car(String id, String brand, String model, double dailyRentalPrice) implements Rentable {

  public Car(String brand, String model, double dailyRentalPrice) {
    this(UUID.randomUUID().toString(), brand, model, dailyRentalPrice);
  }

  public Car(String brand, double dailyRentalPrice) {
    this(UUID.randomUUID().toString(), brand, "Unknown Model", dailyRentalPrice);
  }

  @Override
  public String description() {
    return brand + " " + model;
  }
}
