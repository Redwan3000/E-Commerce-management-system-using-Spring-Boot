package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data
public class ProductsDTO {
    private String name;
    private double price;
    private String info;
    private int categoryId;

}
