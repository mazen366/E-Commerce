package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Order;
import org.example.ecommercelast.repos.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }
    public Order findById(int id) {
        return orderRepo.findById(id).get();
    }
    public Order save(Order order) {
        return orderRepo.save(order);
    }
}
