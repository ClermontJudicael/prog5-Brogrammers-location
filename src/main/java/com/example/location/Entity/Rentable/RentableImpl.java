package com.example.location.Entity.Rentable;

public class RentableImpl implements Rentable {

  private String id;
  private String type;
  private double dailyPrice;
  private String description;

  public RentableImpl(String id, String type, double dailyPrice, String description) {
    this.id = id;
    this.type = type;
    this.dailyPrice = dailyPrice;
    this.description = description;
  }

  // Implémentation des méthodes de l'interface
  @Override
  public double dailyRentalPrice() {
    return dailyPrice;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String id() {
    return id;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public double getDailyPrice() {
    return dailyPrice;
  }

  @Override
  public String getDescription() {
    return description;
  }

  // Optionnel : setters si nécessaire
  public void setId(String id) {
    this.id = id;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDailyPrice(double dailyPrice) {
    this.dailyPrice = dailyPrice;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
