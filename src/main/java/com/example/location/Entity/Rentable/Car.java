package com.example.location.Entity.Rentable;

public record Car(String id, String brand, String model, double dailyRentalPrice)
    implements Rentable {

  public Car(String id, String brand, double dailyRentalPrice) {
    this(id, brand, "Unknown Model", dailyRentalPrice);
  }

  @Override
  public String description() {
    return brand + " " + model;
  }
}
