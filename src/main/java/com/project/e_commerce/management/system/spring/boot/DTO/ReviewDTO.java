package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data

public class ReviewDTO {

    private float rating;
    private String comment;
    private  String review_date;
    private int userId;
    private int productId;
}
