package com.example.location.Entity.Renter;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Entity.Renter.*;

import java.util.List;

public sealed interface Renter permits Person, Company, Church, Organization {
    String name();
    List<Rentable> rentedItems();

    default void rent(Rentable item) {
        rentedItems().add(item);
    }

    default double totalDailyCost() {
        return rentedItems().stream()
                .mapToDouble(Rentable::dailyRentalPrice)
                .sum();
    }

    default String summary() {
        return "%s | Rents %d item(s) | Daily cost: %.2f€"
                .formatted(name(), rentedItems().size(), totalDailyCost());
    }
}