package com.me.orderservice.model;

import lombok.*;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class Category {
    private Long id;
    private String name;
    private String description;
    private List<Product> products;
}
