package com.me.productservice.services;

import com.me.productservice.entities.Category;

import java.util.List;

public interface ICategory {
    void save(Category category);
    Category findId(Long id);
    List<Category> findAll();
}
