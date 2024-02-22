package com.embarkx.firstjobapp.review.impl;

import com.embarkx.firstjobapp.review.Review;
import com.embarkx.firstjobapp.review.ReviewRepository;
import com.embarkx.firstjobapp.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review findById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public void createReview(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public boolean updateReview(Long id, Review review) {
        Optional<Review> reviewOptional = reviewRepository.findById(id);
        if (reviewOptional.isPresent()) {
            Review toUpdate = reviewOptional.get();
            // update fields

            reviewRepository.save(review);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteReview(Long id) {
        return false;
    }
}
