package com.me.deliveryservice.web;

import com.me.deliveryservice.entities.Delivery;
import com.me.deliveryservice.services.IDelivery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {
    private final IDelivery deliveryService;

    public DeliveryController(IDelivery deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping("/delivery")
    public void save(@RequestBody Delivery deliverie) {
        deliveryService.save(deliverie);
    }

    @GetMapping("delivery/{id}")
    public Delivery findId(@PathVariable Long id) {
        return deliveryService.findId(id);
    }

    @GetMapping("deliveries")
    public List<Delivery> findAll() {
        return deliveryService.findAll();
    }
}
