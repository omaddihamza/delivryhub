package com.me.deliveryservice.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Order {
    private Long id;
    private BigDecimal total_price;
    private String status;
    private Time created_at;
    private long assigned_livreur_id;
    private List<OrderItem> order_items;
}
