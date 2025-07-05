package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.Cart_ItemsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Cart_Items;
import com.project.e_commerce.management.system.spring.boot.service.Cart_ItemsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Cart_itemController {
    private final Cart_ItemsService cartItemsService;

    @PostMapping("/user/add_to_cart")
    public Cart_Items addCartItem(@RequestBody Cart_ItemsDTO cartItemsDTO) {
        return cartItemsService.addCartItem(cartItemsDTO);
    }}
