package com.me.orderservice.services;

import com.me.orderservice.entities.OrderItem;

import java.util.List;

public interface IOrderItem {
    void save(OrderItem orderItem);
    OrderItem getOrderItem(Long id);
    List<OrderItem> getOrderItems();
}
