package com.example.location.Repository;

import com.example.location.Entity.Renter.Renter;
import java.util.List;
import java.util.Optional;

public interface RenterRepository {
  Optional<Renter> findById(String id);

  List<Renter> findAll();

  void save(Renter renter);
}
