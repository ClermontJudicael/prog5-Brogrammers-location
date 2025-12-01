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
