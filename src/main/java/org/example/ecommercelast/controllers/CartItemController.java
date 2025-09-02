package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Cartitem;
import org.example.ecommercelast.repos.CartItemRepo;
import org.example.ecommercelast.services.CartItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cart_items")
public class CartItemController {
    private final CartItemService cartItemService;
    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public List<Cartitem> findAll()
    {
        return cartItemService.findAll();
    }


    @GetMapping("{id}")
    public Cartitem findOne(@PathVariable int id)
    {
        return cartItemService.findById(id);
    }

    @PostMapping
    public Cartitem save(@RequestBody Cartitem cartitem)
    {
        return cartItemService.save(cartitem);
    }
}
