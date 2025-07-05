package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.CartsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Carts;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.CartsRepository;
import com.project.e_commerce.management.system.spring.boot.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartsService {
    private final CartsRepository cartsRepository;
    private final UsersRepository usersRepository;

    // Create Cart
    public Carts createCart(CartsDTO cartsDTO) {
        Users user = usersRepository.findById(cartsDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + cartsDTO.getUser_id()));

        Carts cart = new Carts();
        cart.setUser(user);

        return cartsRepository.save(cart);
    }

    // Get Cart By Id
    public Carts getCartById(int id) {
        return cartsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart not found with id: " + id));
    }}
