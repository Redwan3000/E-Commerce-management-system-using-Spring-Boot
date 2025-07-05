package com.project.e_commerce.management.system.spring.boot.repository;

import com.project.e_commerce.management.system.spring.boot.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartsRepository extends JpaRepository<Carts, Integer> {
}
