package com.project.e_commerce.management.system.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String payment_type;
    private String payment_date;
    private double amount;
    private String payment_status;

    @OneToOne
    @JoinColumn(name = "order_id")

    private Orders order;

}
