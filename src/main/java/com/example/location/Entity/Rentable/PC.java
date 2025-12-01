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
