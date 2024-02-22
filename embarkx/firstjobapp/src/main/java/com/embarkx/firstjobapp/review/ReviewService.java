package com.embarkx.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();

    Review findById(Long id);

    void createReview(Review review);

    boolean updateReview(Long id, Review review);

    boolean deleteReview(Long id);
}
