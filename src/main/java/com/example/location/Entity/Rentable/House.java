package com.example.location.Entity.Rentable;

public record House(String address, double dailyRentalPrice) implements Rentable {
  @Override
  public String description() {
    return "House at " + address;
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
