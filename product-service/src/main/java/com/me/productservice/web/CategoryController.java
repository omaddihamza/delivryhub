package com.me.productservice.web;

import com.me.productservice.entities.Category;
import com.me.productservice.services.ICategoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private ICategoryImpl categoryService;

    public CategoryController(ICategoryImpl categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/category")
    public void save(@RequestBody Category category) {
        this.categoryService.save(category);
    }

    @GetMapping("/category/{id}")
    public Category findId(@PathVariable Long id) {
        return categoryService.findId(id);
    }

    @GetMapping("/categories")
    public List<Category> findAll() {
        return categoryService.findAll();
    }
}
