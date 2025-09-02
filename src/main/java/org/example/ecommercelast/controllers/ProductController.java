package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Product;
import org.example.ecommercelast.repos.ProductRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductRepo productRepo;
    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    @GetMapping
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable int id) {
        return  productRepo.findById(id).orElseThrow(() -> new RuntimeException(id + " not found"));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }
}
