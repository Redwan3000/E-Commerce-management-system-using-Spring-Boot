package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Roles role;

    @OneToMany(mappedBy = "user" )
    List<Review> reviewList= new ArrayList<>();


}
