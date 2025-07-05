package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.OrdersDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Address;
import com.project.e_commerce.management.system.spring.boot.entity.Carts;
import com.project.e_commerce.management.system.spring.boot.entity.Orders;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.AddressRepository;
import com.project.e_commerce.management.system.spring.boot.repository.CartsRepository;
import com.project.e_commerce.management.system.spring.boot.repository.OrdersRepository;
import com.project.e_commerce.management.system.spring.boot.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final UsersRepository usersRepository;
    private final CartsRepository cartsRepository;
    private final AddressRepository addressRepository;

    // Create Order
    public Orders createOrder(OrdersDTO ordersDTO) {
        Orders order = new Orders();
        order.setOrder_date(ordersDTO.getOrder_date());
        order.setOrder_status(ordersDTO.getOrder_status());

        Users user = usersRepository.findById(ordersDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + ordersDTO.getUser_id()));
        Carts cart = cartsRepository.findById(ordersDTO.getCart_id())
                .orElseThrow(() -> new RuntimeException("Cart not found with id: " + ordersDTO.getCart_id()));
        Address address = addressRepository.findById(ordersDTO.getAddress_id())
                .orElseThrow(() -> new RuntimeException("Address not found with id: " + ordersDTO.getAddress_id()));

        order.setUsers(user);
        order.setCart(cart);
        order.setAddress(address);

        return ordersRepository.save(order);
    }

    // Update Order Status
    public Orders updateOrderStatus(int id, String newStatus) {
        Orders order = ordersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
        order.setOrder_status(newStatus);
        return ordersRepository.save(order);
    }}
