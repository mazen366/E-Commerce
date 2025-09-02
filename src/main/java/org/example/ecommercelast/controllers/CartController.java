package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Cart;
import org.example.ecommercelast.repos.CartRepo;
import org.example.ecommercelast.repos.UserRepo;
import org.example.ecommercelast.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carts")
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("all")
    public List<Cart> findAll() {
        return cartService.findAll();
    }
    @GetMapping("{id}")
    public Cart findById(@PathVariable int id) {
        return cartService.findById(id);
    }

    @PostMapping("{user_id}")
    public Cart save(@PathVariable Integer user_id, @RequestBody Cart cart) {
        return cartService.save(user_id, cart);
    }
}
