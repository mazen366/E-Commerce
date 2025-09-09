package org.example.ecommercelast.controllers;

import jdk.jshell.spi.ExecutionControl;
import org.example.ecommercelast.errorresponses.UserErrorResponse;
import org.example.ecommercelast.exceptions.UserNotFoundException;
import org.example.ecommercelast.models.Cart;
import org.example.ecommercelast.models.Category;
import org.example.ecommercelast.models.Order;
import org.example.ecommercelast.models.User;
import org.example.ecommercelast.repos.UserRepo;
import org.example.ecommercelast.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;
    public  UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> findAll()
    {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User findById(@PathVariable Integer id)
    {
        return userService.findById(id);
    }

    @GetMapping("{id}/carts")
    public List<Cart> findCartById(@PathVariable Integer id)
    {
        return userService.getCart(id);
    }
    @PostMapping
    public User add(@RequestBody User newUser)
    {
        return userService.save(newUser);
    }


}

