package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Carts {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.PERSIST)

    List<Cart_Items> cart_Items= new ArrayList<Cart_Items>();


    @OneToOne
    @JoinColumn(name="user_id")

    private Users user;
}
