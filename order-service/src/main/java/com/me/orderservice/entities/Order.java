package com.me.orderservice.entities;

import com.me.orderservice.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal total_price;
    private Status status;
    private Time created_at;
    private long assigned_livreur_id;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> order_items;
}
