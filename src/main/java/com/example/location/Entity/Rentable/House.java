package com.example.location.Entity.Rentable;

public record House(String id, String address, double dailyRentalPrice) implements Rentable {

  public House(String address, double dailyRentalPrice) {
    this(java.util.UUID.randomUUID().toString(), address, dailyRentalPrice);
  }

  @Override
  public String description() {
    return "House at " + address;
  }
}
