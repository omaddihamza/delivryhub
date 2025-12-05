package com.me.productservice.services;

import com.me.productservice.entities.Product;

import java.util.List;

public interface IProduct {
    void save(Product product);
    Product findById(Long id);
    List<Product> findAll();
}
