package com.example.location.Entity.Rentable;

import java.util.UUID;

public record House(String id, String address, double dailyRentalPrice) implements Rentable {

  public House(String address, double dailyRentalPrice) {
    this(UUID.randomUUID().toString(), address, dailyRentalPrice);
  }

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
