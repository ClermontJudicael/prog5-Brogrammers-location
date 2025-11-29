package com.example.location.Entity.Renter;

import com.example.location.Entity.Rentable.Rentable;
import java.util.ArrayList;
import java.util.List;

public record Person(String name, List<Rentable> rentedItems) implements Renter {
  public Person(String name) {
    this(name, new ArrayList<>()); // mutable list so we can add items
  }
}
