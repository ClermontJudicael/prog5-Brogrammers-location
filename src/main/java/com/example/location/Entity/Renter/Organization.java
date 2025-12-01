package com.example.location.Entity.Renter;

import com.example.location.Entity.Rentable.Rentable;
import java.util.ArrayList;
import java.util.List;

public record Organization(String name, List<Rentable> rentedItems) implements Renter {
  public Organization(String name) {
    this(name, new ArrayList<>());
  }

  @Override
  public String id() {
    return "";
  }

  @Override
  public String type() {
    return "";
  }

  @Override
  public String getId() {
    return "";
  }

  @Override
  public String getName() {
    return "";
  }

  @Override
  public String getType() {
    return "";
  }
}
