package com.me.orderservice.services;

import com.me.orderservice.entities.Order;
import com.me.orderservice.reposirory.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrderImpl implements IOrder {

   private final OrderRepository orderRepository;

    public IOrderImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(Order order) {
       orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
