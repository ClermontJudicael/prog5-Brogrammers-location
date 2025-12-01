package com.example.location.Entity.Rentable;

public record Car(String brand, String model, double dailyRentalPrice) implements Rentable {
  public Car(String brand, double dailyRentalPrice) {
    this(brand, "Unknown Model", dailyRentalPrice);
  }

  @Override
  public String description() {
    return brand + " " + model;
  }

  @Override
  public String id() {
    return "";
  }

  @Override
  public String getId() {
    return "";
  }

  @Override
  public String getType() {
    return "";
  }

  @Override
  public double getDailyPrice() {
    return 0;
  }

  @Override
  public String getDescription() {
    return "";
  }
}
