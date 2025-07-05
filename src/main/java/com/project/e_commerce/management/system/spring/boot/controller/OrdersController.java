package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.OrdersDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Orders;
import com.project.e_commerce.management.system.spring.boot.service.OrdersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@AllArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    // POST: Create Order
    @PostMapping("/user/create_order")
    public Orders createOrder(@RequestBody OrdersDTO ordersDTO) {
        return ordersService.createOrder(ordersDTO);
    }

    // PUT: Update Order Status
    @PutMapping("/admin/update-status/{id}")
    public Orders updateOrderStatus(@PathVariable int id, @RequestParam String status) {
        return ordersService.updateOrderStatus(id, status);
    }}
