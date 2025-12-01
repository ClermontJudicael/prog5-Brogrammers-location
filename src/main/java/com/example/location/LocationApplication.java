package com.example.location;

import com.example.location.Entity.Rentable.Car;
import com.example.location.Entity.Rentable.House;
import com.example.location.Entity.Rentable.PC;
import com.example.location.Entity.Rentable.SonosSpeaker;
import com.example.location.Entity.Renter.Church;
import com.example.location.Entity.Renter.Company;
import com.example.location.Entity.Renter.Person;
import com.example.location.Repository.RentableRepository;
import com.example.location.Repository.RenterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocationApplication {

  public static void main(String[] args) {
    SpringApplication.run(LocationApplication.class, args);
  }

  @Bean
  CommandLineRunner initData(RentableRepository rentableRepo, RenterRepository renterRepo) {
    return args -> {
      rentableRepo.save(new Car("Toyota", "Corolla", 30000));
      rentableRepo.save(new House("villa fabio", 1000000));
      rentableRepo.save(new PC("asus tuf gaming", 2000));
      rentableRepo.save(new SonosSpeaker("JBL", 100));

      renterRepo.save(new Person("Fabio"));
      renterRepo.save(new Company("Rado"));
      renterRepo.save(new Church("Alain"));
    };
  }
}
