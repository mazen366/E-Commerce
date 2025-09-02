package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Order;
import org.example.ecommercelast.repos.OrderRepo;
import org.example.ecommercelast.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public List<Order> getAllOrders()
    {
        return orderService.findAll();
    }

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable Integer id)
    {
        return  orderService.findById(id);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order)
    {
        return orderService.save(order);
    }
}
