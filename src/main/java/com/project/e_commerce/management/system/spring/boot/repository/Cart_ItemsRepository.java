package com.project.e_commerce.management.system.spring.boot.repository;

import com.project.e_commerce.management.system.spring.boot.entity.Cart_Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cart_ItemsRepository extends JpaRepository<Cart_Items, Integer> {
}
