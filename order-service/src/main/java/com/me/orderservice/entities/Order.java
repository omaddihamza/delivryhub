package com.me.orderservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.orderservice.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal total_price;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Timestamp created_at;
    private long assigned_livreur_id;
    @OneToMany(mappedBy = "order")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<OrderItem> order_items;
}
