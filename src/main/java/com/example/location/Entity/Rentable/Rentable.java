package com.example.location.Entity.Rentable;

public interface Rentable {
  double dailyRentalPrice();

  String description();

  default double priceForDays(int days) {
    return dailyRentalPrice() * Math.max(0, days);
  }

    String id();

  String getId();

  String getType();

  double getDailyPrice();

  String getDescription();
}
