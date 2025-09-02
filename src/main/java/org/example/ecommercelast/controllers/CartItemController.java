package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Cartitem;
import org.example.ecommercelast.repos.CartItemRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cart_items")
public class CartItemController {
    private final CartItemRepo cartItemRepo;
    public CartItemController(CartItemRepo cartItemRepo) {
        this.cartItemRepo = cartItemRepo;
    }

    @GetMapping
    public List<Cartitem> findAll()
    {
        return cartItemRepo.findAll();
    }


    @GetMapping("{id}")
    public Cartitem findOne(@PathVariable int id)
    {
        return cartItemRepo.findById(id).orElseThrow(() -> new RuntimeException(id + " not found"));
    }

    @PostMapping
    public Cartitem save(@RequestBody Cartitem cartitem)
    {
        return cartItemRepo.save(cartitem);
    }
}
