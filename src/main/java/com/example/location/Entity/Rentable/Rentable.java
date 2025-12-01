package com.example.location.Entity.Rentable;

public interface Rentable {
  String id();

  double dailyRentalPrice();

  String description();

  default double priceForDays(int days) {
    return dailyRentalPrice() * Math.max(0, days);
  }

  String getId();

  String getType();

  double getDailyPrice();

  String getDescription();
}
