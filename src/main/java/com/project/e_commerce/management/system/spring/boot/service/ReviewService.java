package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.ReviewDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Products;
import com.project.e_commerce.management.system.spring.boot.entity.Review;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.ProductsRepository;
import com.project.e_commerce.management.system.spring.boot.repository.ReviewRepository;
import com.project.e_commerce.management.system.spring.boot.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewsRepository;
    private final UsersRepository usersRepository;
    private final ProductsRepository productsRepository;

    public void addReview(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setRating(reviewDTO.getRating());
        review.setComment(reviewDTO.getComment());
        review.setReview_date(reviewDTO.getReview_date());

        Users user = usersRepository.findById(reviewDTO.getUserId()).orElseThrow();
        Products product = productsRepository.findById(reviewDTO.getProductId()).orElseThrow();

        review.setUser(user);
        review.setProduct(product);

        reviewsRepository.save(review);
    }

    public List<Review> getAllReviews() {
        return reviewsRepository.findAll();
    }
}
