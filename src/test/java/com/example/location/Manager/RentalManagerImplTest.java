package com.example.location.Manager;

import static org.junit.jupiter.api.Assertions.*;

import com.example.location.Entity.Rentable.Car;
import com.example.location.Entity.Rentable.PC;
import com.example.location.Entity.Rentable.Rentable;
import com.example.location.Manager.exceptions.DuplicateRentableException;
import com.example.location.Manager.exceptions.RentableNotFoundException;
import org.junit.jupiter.api.Test;

class RentalManagerImplTest {

  @Test
  void testAddRentableAndRetrieve() {
    RentalManager manager = new RentalManagerImpl();
    Rentable car = new Car("car1", "Toyota", "Corolla", 40.0);

    manager.addRentable(car);
    Rentable retrieved = manager.getRentableOrThrow("car1");

    assertEquals(car, retrieved);
  }

  @Test
  void testAddDuplicateRentable() {
    RentalManager manager = new RentalManagerImpl();
    Rentable car = new Car("car1", "Toyota", "Corolla", 40.0);
    manager.addRentable(car);
    assertThrows(DuplicateRentableException.class, () -> manager.addRentable(car));
  }

  @Test
  void testGetNonexistentRentable() {
    RentalManager manager = new RentalManagerImpl();
    assertThrows(RentableNotFoundException.class, () -> manager.getRentableOrThrow("unknown"));
  }

  @Test
  void testListRentables() {
    RentalManager manager = new RentalManagerImpl();
    Rentable car = new Car("car1", "Toyota", "Corolla", 40.0);
    Rentable pc = new PC("pc1", "Dell XPS", 30.0);

    manager.addRentable(car);
    manager.addRentable(pc);

    assertEquals(2, manager.listRentables().size());
  }
}
