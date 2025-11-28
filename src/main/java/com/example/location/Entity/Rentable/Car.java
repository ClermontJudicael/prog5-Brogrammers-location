package com.example.location.Entity.Rentable;

public record Car(String brand, String model, double dailyRentalPrice) implements Rentable {
    public Car(String brand, double dailyRentalPrice) {
        this(brand, "Unknown Model", dailyRentalPrice);
    }

    @Override
    public String description() {
        return brand + " " + model;
    }
}