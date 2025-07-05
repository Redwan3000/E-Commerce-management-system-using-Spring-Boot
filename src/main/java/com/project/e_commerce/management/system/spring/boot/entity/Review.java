package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float rating;
    private String comment;
    private  String review_date;

    @ManyToOne
    @JoinColumn(name = "user_id")

    private Users user;


    @ManyToOne
    @JoinColumn(name="product_id")

    private Products product;

}
