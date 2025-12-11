package com.me.orderservice.web;


import com.me.orderservice.entities.Order;
import com.me.orderservice.services.IOrderImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final IOrderImpl orderImpl;

    public OrderController(IOrderImpl orderImpl) {
        this.orderImpl = orderImpl;
    }

    @PostMapping("/order")
    public void save(@RequestBody Order order) {
        orderImpl.save(order);
    }

    @GetMapping("order/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderImpl.getOrder(id);
    }

    @GetMapping("order")
    public List<Order> getOrders() {
        return orderImpl.getOrders();
    }
}
