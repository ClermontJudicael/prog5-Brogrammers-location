package com.example.location.Entity.Rentable;

public record SonosSpeaker(String id, String type, double dailyRentalPrice) implements Rentable {

  public SonosSpeaker(String type, double dailyRentalPrice) {
    this(java.util.UUID.randomUUID().toString(), type, dailyRentalPrice);
  }

  @Override
  public String description() {
    return "Sonos Speaker - " + type;
  }
}
