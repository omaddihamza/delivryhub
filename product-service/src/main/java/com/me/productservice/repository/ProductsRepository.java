package com.me.productservice.repository;

import com.me.productservice.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}
