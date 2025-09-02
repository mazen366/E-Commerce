package org.example.ecommercelast.controllers;

import org.example.ecommercelast.models.Review;
import org.example.ecommercelast.repos.ReviewRepo;
import org.example.ecommercelast.services.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping
    public List<Review> findAll()
    {
        return reviewService.findAll();
    }

    @GetMapping("{id}")
    public Review findOne(@PathVariable Integer id)
    {
        return reviewService.findById(id);
    }

    @PostMapping
    public Review save(@RequestBody Review review)
    {
        return reviewService.save(review);
    }
}
