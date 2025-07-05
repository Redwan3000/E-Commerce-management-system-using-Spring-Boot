package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data
public class PaymentDTO {
    private String payment_type;
    private String payment_date;
    private double amount;
    private String payment_status;
    private int order_id;
}
