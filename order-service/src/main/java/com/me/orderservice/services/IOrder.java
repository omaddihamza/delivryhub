package com.me.orderservice.services;

import com.me.orderservice.entities.Order;

import java.util.List;

public interface IOrder {
    void save(Order order);
    Order getOrder(Long id);
    List<Order> getOrders();
}
