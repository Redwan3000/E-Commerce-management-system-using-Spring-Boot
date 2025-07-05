package com.project.e_commerce.management.system.spring.boot.repository;

import com.project.e_commerce.management.system.spring.boot.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
