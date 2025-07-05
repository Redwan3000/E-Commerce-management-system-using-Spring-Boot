package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.ProductsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Products;
import com.project.e_commerce.management.system.spring.boot.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @PostMapping("/admin/addProduct")
    public void addProduct(@RequestBody ProductsDTO productsDTO) {
        productsService.addProduct(productsDTO);
    }

    @GetMapping("/user/getProducts")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }
}
