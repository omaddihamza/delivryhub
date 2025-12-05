package com.me.orderservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long order_id;
    private long product_id;
    private int quantity;
    private BigDecimal unit_price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
