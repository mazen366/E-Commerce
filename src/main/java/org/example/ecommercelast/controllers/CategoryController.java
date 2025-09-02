package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Category;
import org.example.ecommercelast.repos.CategoryRepo;
import org.example.ecommercelast.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<Category> findAll()
    {
        return categoryService.findAll();
    }

    @GetMapping("{id}")
    public Category findById(@PathVariable Integer id)
    {
        return categoryService.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category)
    {
        return categoryService.save(category);
    }
}
