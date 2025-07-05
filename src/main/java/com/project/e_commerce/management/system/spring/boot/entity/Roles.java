package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String role_name;


    @OneToMany(mappedBy ="role" ,cascade = CascadeType.PERSIST)
    List<Users> users=new ArrayList<>();

}
