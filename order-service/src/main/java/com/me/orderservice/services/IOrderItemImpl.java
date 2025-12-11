package com.me.orderservice.services;

import com.me.orderservice.entities.OrderItem;
import com.me.orderservice.reposirory.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrderItemImpl implements IOrderItem {

    private final OrderItemRepository orderItemRepository;

    public IOrderItemImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public void save(OrderItem orderItem) {
       orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem getOrderItem(Long id) {
        return orderItemRepository.findById(id).orElseThrow(()->new RuntimeException("OrderItem Not Found"));
    }

    @Override
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }
}
