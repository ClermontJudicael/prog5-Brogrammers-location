package com.example.location.Entity.Rentable;

public record SonosSpeaker(String type, double dailyRentalPrice) implements Rentable {
  @Override
  public String description() {
    return "Sonos Speaker - " + type;
  }
}
