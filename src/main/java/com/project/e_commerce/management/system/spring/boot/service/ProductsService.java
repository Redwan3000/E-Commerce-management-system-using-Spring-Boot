package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.ProductsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Categories;
import com.project.e_commerce.management.system.spring.boot.entity.Products;
import com.project.e_commerce.management.system.spring.boot.repository.CategoriesRepository;
import com.project.e_commerce.management.system.spring.boot.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductsService {
    private final ProductsRepository productsRepository;
    private final CategoriesRepository categoriesRepository;

    // returns true if product added, false if category not found
    public boolean addProduct(ProductsDTO dto) {
        Optional<Categories> categoryOpt = categoriesRepository.findById(dto.getCategoryId());
        if (categoryOpt.isEmpty()) {
            // Category not found, don't add product
            return false;
        }

        Products product = new Products();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setInfo(dto.getInfo());
        product.setCategories(categoryOpt.get());

        productsRepository.save(product);
        return true;
    }

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
}
