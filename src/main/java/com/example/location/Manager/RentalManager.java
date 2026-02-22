package com.example.location.Manager;

import com.example.location.Entity.Rentable.Rentable;
import java.util.List;

public interface RentalManager {
    void addRentable(Rentable rentable);
    Rentable getRentableOrThrow(String id);
    List<Rentable> listRentables();
}
