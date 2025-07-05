package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.CategoriesDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Categories;
import com.project.e_commerce.management.system.spring.boot.service.CategoriesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoriesController {
    private final CategoriesService categoriesService;


    @PostMapping("/admin/addCategory")
    public void addCategory(@RequestBody CategoriesDTO categoriesDTO) {
        categoriesService.addCategory(categoriesDTO);
    }


    @GetMapping("/user/getCategories")
    public List<Categories> getAllCategories() {
        return categoriesService.getAllCategories();
    }

    @DeleteMapping("/admin/deleteCategory/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoriesService.deleteCategoryById(id);
    }


}
