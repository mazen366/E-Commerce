package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Cart;
import org.example.ecommercelast.repos.CartRepo;
import org.example.ecommercelast.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartRepo cartRepo;
    private final UserRepo userRepo;
    public CartService(CartRepo cartRepo, UserRepo userRepo) {
        this.cartRepo = cartRepo;
        this.userRepo = userRepo;
    }

    public List<Cart> findAll() {
        return cartRepo.findAll();
    }

    public Cart findById(int id) {
        return cartRepo.findById(id).get();
    }

    public Cart save(int user_id, Cart cart) {
        if(userRepo.findById(user_id).isPresent())
            throw new RuntimeException("User was found");
        cart.setUser(userRepo.findById(user_id).orElse(null));
        return cartRepo.save(cart);
    }
}
