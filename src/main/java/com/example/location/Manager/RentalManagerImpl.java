package com.example.location.Manager;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Manager.exceptions.*;
import java.util.*;

public class RentalManagerImpl implements RentalManager {

    private final Map<String, Rentable> rentableStore = new HashMap<>();

    @Override
    public void addRentable(Rentable rentable) {
        if (rentableStore.containsKey(rentable.id())) {
            throw new DuplicateRentableException(rentable.id());
        }
        rentableStore.put(rentable.id(), rentable);
    }

    @Override
    public Rentable getRentableOrThrow(String id) {
        Rentable r = rentableStore.get(id);
        if (r == null) throw new RentableNotFoundException(id);
        return r;
    }

    @Override
    public List<Rentable> listRentables() {
        return new ArrayList<>(rentableStore.values());
    }
}
