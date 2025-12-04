package com.me.productservice.services;

import com.me.productservice.entites.Category;
import com.me.productservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryImpl implements ICategory {


    private final CategoryRepository categoryRepository;

    public ICategoryImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void save(Category category) {
      categoryRepository.save(category);
    }

    @Override
    public Category findId(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
