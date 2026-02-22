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
}
