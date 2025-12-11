package com.me.orderservice.web;


import com.me.orderservice.entities.OrderItem;
import com.me.orderservice.services.IOrderItemImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderItemController {

    private final IOrderItemImpl orderItemImpl;

    public OrderItemController(IOrderItemImpl orderItemImpl) {
        this.orderItemImpl = orderItemImpl;
    }

    @PostMapping("/orderitem")
    public void save(@RequestBody OrderItem orderItem) {
        orderItemImpl.save(orderItem);
    }

    @GetMapping("/orderitem/{id}")
    public OrderItem getOrderItem(@PathVariable Long id) {
        return orderItemImpl.getOrderItem(id);
    }

    @GetMapping("/orderitems")
    public List<OrderItem> getOrderItems() {
        return orderItemImpl.getOrderItems();
    }
}
