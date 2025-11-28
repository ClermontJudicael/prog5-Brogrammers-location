package com.example.location.Entity.Rentable;

public record PC(String model, double dailyRentalPrice) implements Rentable {
    @Override
    public String description() {
        return "PC: " + model;
    }
}
