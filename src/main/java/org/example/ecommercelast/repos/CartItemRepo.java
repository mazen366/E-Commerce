package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Cartitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepo extends JpaRepository<Cartitem, Integer> {
}
