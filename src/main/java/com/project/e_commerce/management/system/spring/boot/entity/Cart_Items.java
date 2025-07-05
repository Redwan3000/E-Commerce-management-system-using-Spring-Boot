package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart_Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")

    private Carts cart;

    @ManyToOne
    @JoinColumn(name = "product_id")

    private Products product;


}
