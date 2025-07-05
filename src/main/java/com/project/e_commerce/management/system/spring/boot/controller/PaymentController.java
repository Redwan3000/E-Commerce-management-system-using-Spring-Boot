package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.PaymentDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Payment;
import com.project.e_commerce.management.system.spring.boot.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PaymentController {

    private final PaymentService paymentsService;

    @PostMapping("/user/make-payment")
    public Payment makePayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentsService.createPayment(paymentDTO);
    }

    @GetMapping("/user/payment-details/{id}")
    public Payment paymentDetails(@PathVariable int id) {
        return paymentsService.getPaymentById(id);
    }
}
