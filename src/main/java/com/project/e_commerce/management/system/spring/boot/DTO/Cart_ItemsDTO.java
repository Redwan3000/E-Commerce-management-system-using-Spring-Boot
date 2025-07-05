package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data
public class Cart_ItemsDTO {
    private int cart_id;
    private int product_id;
    private int quantity;
}
