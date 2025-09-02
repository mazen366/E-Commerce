package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Cart;
import org.example.ecommercelast.repos.CartRepo;
import org.example.ecommercelast.repos.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carts")
public class CartController {
    private final CartRepo cartRepo;
    private final UserRepo userRepo;
    public CartController(CartRepo cartRepo, UserRepo userRepo) {
        this.cartRepo = cartRepo;
        this.userRepo = userRepo;
    }
    @GetMapping
    public List<Cart> findAll() {
        return cartRepo.findAll();
    }
    @GetMapping("{id}")
    public Cart findById(@PathVariable int id) {
        return cartRepo.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
    }

    @PostMapping("{id}")
    public Cart save(@PathVariable Integer id, @RequestBody Cart cart) {
        cart.setUser(userRepo.findById(id).orElse(null));
        return cartRepo.save(cart);
    }

}
