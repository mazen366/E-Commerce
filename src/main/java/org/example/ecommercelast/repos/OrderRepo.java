package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
