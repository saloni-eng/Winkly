package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/deals")
@CrossOrigin(origins = "*")
public class DealController {

    @Autowired
    private DealRepository dealRepository;

    @GetMapping
    public List<Deal> getAllDeals() {
        if (dealRepository.count() == 0) {
            dealRepository.save(new Deal("Mayonaise", "Albert Heijn", 1.89, 1.20));
            dealRepository.save(new Deal("Pindakaas", "Jumbo", 3.49, 2.50));
        }
        return dealRepository.findAll();
    }
}