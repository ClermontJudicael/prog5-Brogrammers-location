package com.example.location.Repository.impl;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Repository.RentableRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class InMemoryRentableRepository implements RentableRepository {

    private final Map<String, Rentable> store = new HashMap<>();

    @Override
    public Optional<Rentable> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Rentable> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void save(Rentable rentable) {
        store.put(rentable.id(), rentable);
    }
}
