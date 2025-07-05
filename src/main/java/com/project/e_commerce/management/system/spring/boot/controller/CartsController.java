package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.CartsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Carts;
import com.project.e_commerce.management.system.spring.boot.service.CartsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CartsController {
    private final CartsService cartsService;

    // POST /carts/create
    @PostMapping("/user/create_cart")
    public Carts createCart(@RequestBody CartsDTO cartsDTO) {
        return cartsService.createCart(cartsDTO);
    }

    // GET /carts/{id}
    @GetMapping("/user/getcart_byId/{id}")
    public Carts getCart(@PathVariable int id) {
        return cartsService.getCartById(id);
    }}
