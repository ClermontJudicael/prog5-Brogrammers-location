package com.example.location;

import com.example.location.Entity.Rentable.*;
import com.example.location.Entity.Renter.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
		var car = new Car("Toyota", "Corolla", 65.0);
		var pc = new PC("hp", 40.0);
		var house = new House("123", 200.0);

		// Create renter
		var alice = new Person("Alice");

		alice.rent(car);
		alice.rent(pc);
		alice.rent(house);
		System.out.println(alice.summary());
	}

}
