package com.example.location.Repository;

import com.example.location.Entity.Rentable.Rentable;
import java.util.List;
import java.util.Optional;

public interface RentableRepository {
  Optional<Rentable> findById(String id);

  List<Rentable> findAll();

  void save(Rentable rentable);
}
