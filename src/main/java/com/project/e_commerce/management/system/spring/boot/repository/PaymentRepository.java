package com.project.e_commerce.management.system.spring.boot.repository;

import com.project.e_commerce.management.system.spring.boot.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
