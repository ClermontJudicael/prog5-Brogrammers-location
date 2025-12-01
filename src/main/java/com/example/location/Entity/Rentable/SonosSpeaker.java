package com.example.location.Entity.Rentable;

import java.util.UUID;

public record SonosSpeaker(String id, String type, double dailyRentalPrice) implements Rentable {

  public SonosSpeaker(String type, double dailyRentalPrice) {
    this(UUID.randomUUID().toString(), type, dailyRentalPrice);
  }

  @Override
  public String description() {
    return "Sonos Speaker - " + type;
  }
}
