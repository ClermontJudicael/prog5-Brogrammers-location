package com.example.location.Entity.Renter;

import com.example.location.Entity.Rentable.Rentable;
import java.util.ArrayList;
import java.util.List;

public final class GenericRenter implements Renter {

    private String id;
    private String name;
    private String type;
    private List<Rentable> rentedItems = new ArrayList<>();

    public GenericRenter(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String id() { return id; }

    @Override
    public String name() { return name; }

    @Override
    public List<Rentable> rentedItems() { return rentedItems; }

    @Override
    public String type() { return type; }

    @Override
    public String getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public String getType() { return type; }
}
