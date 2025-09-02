package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Order;
import org.example.ecommercelast.repos.OrderRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderRepo orderRepo;
    public OrderController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
    @GetMapping
    public List<Order> getAllOrders()
    {
        return orderRepo.findAll();
    }

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable Integer id)
    {
        return  orderRepo.findById(id).orElseThrow(() -> new RuntimeException("Order Not Found"));
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order)
    {
        return orderRepo.save(order);
    }
}
