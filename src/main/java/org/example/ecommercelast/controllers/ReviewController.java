package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Review;
import org.example.ecommercelast.repos.ReviewRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
public class ReviewController {
    private final ReviewRepo reviewRepo;
    public ReviewController(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @GetMapping
    public List<Review> findAll()
    {
        return reviewRepo.findAll();
    }

    @GetMapping("{id}")
    public Review findOne(@PathVariable Integer id)
    {
        return reviewRepo.findById(id).orElseThrow(() -> new RuntimeException(id + " not found"));
    }

    @PostMapping
    public Review save(@RequestBody Review review)
    {
        return reviewRepo.save(review);
    }
}
