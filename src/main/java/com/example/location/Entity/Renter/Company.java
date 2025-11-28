package com.example.location.Entity.Renter;

import com.example.location.Entity.Rentable.Rentable;

import java.util.ArrayList;
import java.util.List;

public record Company(String name, List<Rentable> rentedItems) implements Renter {
    public Company(String name) {
        this(name, new ArrayList<>());
    }
}
