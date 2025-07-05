package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data
public class OrdersDTO {
    private String order_date;
    private String order_status;
    private int user_id;
    private int cart_id;
    private int address_id;
}
