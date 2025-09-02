package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Category;
import org.example.ecommercelast.repos.CategoryRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    private final CategoryRepo categoryRepo;
    public CategoryController(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    @GetMapping
    public List<Category> findAll()
    {
        return categoryRepo.findAll();
    }

    @GetMapping("{id}")
    public Category findById(@PathVariable Integer id)
    {
        return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException(id + " is not found"));
    }

    @PostMapping
    public Category save(@RequestBody Category category)
    {
        return categoryRepo.save(category);
    }
}
