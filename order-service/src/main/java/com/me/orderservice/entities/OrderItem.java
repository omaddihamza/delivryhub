package com.me.orderservice.entities;

import com.me.orderservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long product_id;
    private int quantity;
    private BigDecimal unit_price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Transient
    private Product product;
}
