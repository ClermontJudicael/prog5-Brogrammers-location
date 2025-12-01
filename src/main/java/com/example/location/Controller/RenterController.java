package com.example.location.Controller;

import com.example.location.Service.RenterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/renter")
public class RenterController {

  private final RenterService renterService;

  public RenterController(RenterService renterService) {
    this.renterService = renterService;
  }

  @PostMapping("/{renterId}/rent/{rentableId}")
  public void rent(@PathVariable String renterId, @PathVariable String rentableId) {
    renterService.rent(renterId, rentableId);
  }

  @GetMapping("/{renterId}/summary")
  public String summary(@PathVariable String renterId) {
    return renterService.renterSummary(renterId);
  }
}
