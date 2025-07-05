package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String city;
    private String post_code;

    @ManyToOne
    @JoinColumn(name = "user_id")

    private Users user;

}
