package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.Cart_ItemsDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Cart_Items;
import com.project.e_commerce.management.system.spring.boot.entity.Carts;
import com.project.e_commerce.management.system.spring.boot.entity.Products;
import com.project.e_commerce.management.system.spring.boot.repository.Cart_ItemsRepository;
import com.project.e_commerce.management.system.spring.boot.repository.CartsRepository;
import com.project.e_commerce.management.system.spring.boot.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Cart_ItemsService {
    private final Cart_ItemsRepository cartItemsRepository;
    private final CartsRepository cartsRepository;
    private final ProductsRepository productsRepository;

    public Cart_Items addCartItem(Cart_ItemsDTO dto) {
        Carts cart = cartsRepository.findById(dto.getCart_id())
                .orElseThrow(() -> new RuntimeException("Cart not found with id: " + dto.getCart_id()));
        Products product = productsRepository.findById(dto.getProduct_id())
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + dto.getProduct_id()));

        Cart_Items cartItem = new Cart_Items();
        cartItem.setCart(cart);
        cartItem.setProduct(product);
        cartItem.setQuantity(dto.getQuantity());

        return cartItemsRepository.save(cartItem);
    }}
