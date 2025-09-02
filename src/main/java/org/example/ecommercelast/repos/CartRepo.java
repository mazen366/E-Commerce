package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {
}
