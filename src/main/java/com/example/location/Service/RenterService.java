package com.example.location.Service;

import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Entity.Renter.Renter;
import com.example.location.Manager.exceptions.RentableNotFoundException;
import com.example.location.Manager.exceptions.RenterNotFoundException;
import com.example.location.Repository.RenterRepository;
import com.example.location.Repository.RentableRepository;
import org.springframework.stereotype.Service;

@Service
public class RenterService {

    private final RenterRepository renterRepo;
    private final RentableRepository rentableRepo;

    public RenterService(RenterRepository renterRepo, RentableRepository rentableRepo) {
        this.renterRepo = renterRepo;
        this.rentableRepo = rentableRepo;
    }

    public Renter findRenter(String id) {
        return renterRepo.findById(id)
                .orElseThrow(() -> new RenterNotFoundException(id));
    }

    public void rent(String renterId, String rentableId) {
        Renter renter = findRenter(renterId);
        Rentable item = rentableRepo.findById(rentableId)
                .orElseThrow(() -> new RentableNotFoundException(rentableId));

        renter.rent(item);
        renterRepo.save(renter);
    }

    public String renterSummary(String renterId) {
        return findRenter(renterId).summary();
    }
}
