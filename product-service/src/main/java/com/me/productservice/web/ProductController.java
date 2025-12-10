package com.me.productservice.web;

import com.me.productservice.entities.Product;
import com.me.productservice.services.IProductImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private IProductImpl productService;

    public ProductController(IProductImpl productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }
}
