package com.example.location.Repository.impl;

import com.example.location.Entity.Renter.Renter;
import com.example.location.Repository.RenterRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class InMemoryRenterRepository implements RenterRepository {

    private final Map<String, Renter> store = new HashMap<>();

    @Override
    public Optional<Renter> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Renter> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void save(Renter renter) {
        store.put(renter.name(), renter);
    }
}
