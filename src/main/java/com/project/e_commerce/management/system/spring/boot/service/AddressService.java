package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.AddressDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Address;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.AddressRepository;
import com.project.e_commerce.management.system.spring.boot.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final UsersRepository usersRepository;

    public Address createAddress(AddressDTO addressDTO) {
        Users user = usersRepository.findById(addressDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + addressDTO.getUser_id()));

        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setCity(addressDTO.getCity());
        address.setPost_code(addressDTO.getPost_code());
        address.setUser(user);

        return addressRepository.save(address);
    }}
