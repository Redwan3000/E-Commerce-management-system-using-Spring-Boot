package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.ReviewDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Review;
import com.project.e_commerce.management.system.spring.boot.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/user/addReview")
    public void addReview(@RequestBody ReviewDTO reviewDTO) {
        reviewService.addReview(reviewDTO);
    }

    @GetMapping("/user/getReviews")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

}
