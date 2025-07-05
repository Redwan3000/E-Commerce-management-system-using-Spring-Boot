package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.CategoriesDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Categories;
import com.project.e_commerce.management.system.spring.boot.repository.CategoriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;  // Correct repository

    public void addCategory(CategoriesDTO categoriesDTO) {
        Categories category = new Categories();
        category.setName(categoriesDTO.getName());
        categoriesRepository.save(category);
    }

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public void deleteCategoryById(int id) {
        categoriesRepository.deleteById(id);
    }
}