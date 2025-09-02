package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Cart;
import org.example.ecommercelast.models.Order;
import org.example.ecommercelast.models.User;
import org.example.ecommercelast.repos.CartRepo;
import org.example.ecommercelast.repos.OrderRepo;
import org.example.ecommercelast.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final OrderRepo orderRepo;
    private final CartRepo cartRepo;
    public UserService(UserRepo userRepo,  OrderRepo orderRepo, CartRepo cartRepo) {
        this.userRepo = userRepo;
        this.orderRepo = orderRepo;
        this.cartRepo = cartRepo;
    }

    public User save(User user)
    {
        userRepo.save(user);
        return user;
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User findById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    public List<Order> getOrders(Integer id) {
        List <Order> orders = orderRepo.findAll();
        List <Order> ret = new ArrayList<>();
        for(Order order : orders)
        {
            if(order.getId().equals(id))
                ret.add(order);
        }
        return ret;
    }

    public List<Cart> getCart(Integer id) {
        List <Cart> carts = cartRepo.findAll();
        List <Cart> ret = new ArrayList<>();
        for(Cart cart : carts)
        {
            if(cart.getId().equals(id))
                ret.add(cart);
        }
        return ret;
    }
}
