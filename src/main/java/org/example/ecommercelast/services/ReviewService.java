package org.example.ecommercelast.services;

import org.example.ecommercelast.models.Review;
import org.example.ecommercelast.repos.ReviewRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepo reviewRepo;
    public ReviewService(ReviewRepo reviewRepo)
    {
        this.reviewRepo = reviewRepo;
    }

    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    public Review findById(Integer id) {
        return reviewRepo.findById(id).get();
    }

    public Review save(Review review) {
        return reviewRepo.save(review);
    }
}
