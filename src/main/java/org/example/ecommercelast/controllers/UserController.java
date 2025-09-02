package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Category;
import org.example.ecommercelast.models.User;
import org.example.ecommercelast.repos.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @GetMapping
    public List<User> findAll()
    {
        return userRepo.findAll();
    }

    @GetMapping("{id}")
    public User findById(@PathVariable Integer id)
    {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException(id + " not found"));
    }

    @PostMapping
    public User create(@RequestBody User newUser)
    {
        return userRepo.save(newUser);
    }
}

