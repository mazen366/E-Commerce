package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Category;
import org.example.ecommercelast.repos.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepo categoryRepo;
    public CategoryService(CategoryRepo categoryRepo)
    {
        this.categoryRepo = categoryRepo;
    }

    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    public Category findById(Integer id) {
        return categoryRepo.findById(id).get();
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}

