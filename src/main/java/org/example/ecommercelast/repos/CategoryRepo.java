package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
