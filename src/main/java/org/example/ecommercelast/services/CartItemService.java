package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Cartitem;
import org.example.ecommercelast.repos.CartItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {
    private final CartItemRepo cartItemRepo;
    public CartItemService(CartItemRepo cartItemRepo) {
        this.cartItemRepo = cartItemRepo;
    }

    public List<Cartitem> findAll() {
        return cartItemRepo.findAll();
    }

    public Cartitem findById(int id) {
        return cartItemRepo.findById(id).get();
    }

    public Cartitem save(Cartitem cartitem) {
        return cartItemRepo.save(cartitem);
    }
}
