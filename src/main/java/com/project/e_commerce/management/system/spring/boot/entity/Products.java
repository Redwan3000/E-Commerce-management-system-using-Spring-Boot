package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String info;


    @OneToMany(mappedBy = "product",cascade = CascadeType.PERSIST)

    private List<Review> reviews= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "category_id")

    private Categories categories;

    @OneToMany(mappedBy = "product",cascade = CascadeType.PERSIST)

    List<Cart_Items> cart_items = new ArrayList<>();

}
