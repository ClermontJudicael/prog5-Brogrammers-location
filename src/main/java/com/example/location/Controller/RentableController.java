package com.example.location.Controller;

import com.example.location.Service.RentableService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentable")
public class RentableController {

    private final RentableService rentableService;

    public RentableController(RentableService rentableService) {
        this.rentableService = rentableService;
    }

    @GetMapping("/{id}")
    public String description(@PathVariable String id) {
        return rentableService.describe(id);
    }

    @GetMapping("/{id}/price")
    public double price(@PathVariable String id, @RequestParam int days) {
        return rentableService.calculatePrice(id, days);
    }

    @GetMapping
    public Object all() {
        return rentableService.findAll();
    }
}
