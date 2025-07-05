package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.PaymentDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Orders;
import com.project.e_commerce.management.system.spring.boot.entity.Payment;
import com.project.e_commerce.management.system.spring.boot.repository.OrdersRepository;
import com.project.e_commerce.management.system.spring.boot.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentsRepository;
    private final OrdersRepository ordersRepository;

    public Payment createPayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        payment.setPayment_type(paymentDTO.getPayment_type());
        payment.setPayment_date(paymentDTO.getPayment_date());
        payment.setAmount(paymentDTO.getAmount());
        payment.setPayment_status(paymentDTO.getPayment_status());

        Orders order = ordersRepository.findById(paymentDTO.getOrder_id())
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + paymentDTO.getOrder_id()));

        payment.setOrder(order);
        return paymentsRepository.save(payment);
    }

    public Payment getPaymentById(int id) {
        return paymentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found with id: " + id));
    }}
