package com.example.location.Entity.Rentable;

public record House(String address, double dailyRentalPrice) implements Rentable {
    @Override
    public String description() {
        return "House at " + address;
    }
}
