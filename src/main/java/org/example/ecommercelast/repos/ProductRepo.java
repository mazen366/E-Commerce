package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
