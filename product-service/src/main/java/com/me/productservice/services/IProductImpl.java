package com.me.productservice.services;

import com.me.productservice.entites.Product;
import com.me.productservice.repository.CategoryRepository;
import com.me.productservice.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductImpl implements IProduct {

    private final ProductsRepository productsRepository;

    public IProductImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void save(Product product) {
        productsRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productsRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> findAll() {
        return productsRepository.findAll();
    }
}
