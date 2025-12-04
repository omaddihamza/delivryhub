package com.me.productservice.entites;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "category_id" )
    private Category categories;
    private Timestamp created;
}
