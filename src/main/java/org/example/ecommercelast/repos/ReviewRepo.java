package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Integer> {
}
