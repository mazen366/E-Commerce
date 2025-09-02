package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Product;
import org.example.ecommercelast.repos.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Product findById(int id) {
        return productRepo.findById(id).get();
    }

    public Product save(Product product) {
        return productRepo.save(product);
    }
}
