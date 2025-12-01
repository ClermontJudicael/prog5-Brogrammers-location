package com.example.location.Entity.Rentable;

public record PC(String model, double dailyRentalPrice) implements Rentable {
  @Override
  public String description() {
    return "PC: " + model;
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
