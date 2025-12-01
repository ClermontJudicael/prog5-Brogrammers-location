package com.example.location.Service;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Manager.exceptions.RentableNotFoundException;
import com.example.location.Repository.RentableRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RentableService {

  private final RentableRepository rentableRepo;

  public RentableService(RentableRepository rentableRepo) {
    this.rentableRepo = rentableRepo;
  }

  public List<Rentable> findAll() {
    return rentableRepo.findAll();
  }

  public Rentable findById(String id) {
    return rentableRepo.findById(id).orElseThrow(() -> new RentableNotFoundException(id));
  }

  public double calculatePrice(String rentableId, int days) {
    return findById(rentableId).priceForDays(days);
  }

  public String describe(String rentableId) {
    return findById(rentableId).description();
  }
}
