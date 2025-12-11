package com.me.orderservice.reposirory;

import com.me.orderservice.entities.Order;
import com.me.orderservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
