package com.me.orderservice.model;


import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Category category;
    private Timestamp created;
}
