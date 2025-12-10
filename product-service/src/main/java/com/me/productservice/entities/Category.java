package com.me.productservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Product> products;
}
