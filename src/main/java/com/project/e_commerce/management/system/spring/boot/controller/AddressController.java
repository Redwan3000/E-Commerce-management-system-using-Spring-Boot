package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.AddressDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Address;
import com.project.e_commerce.management.system.spring.boot.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping("/user/create_address")
    public Address createAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.createAddress(addressDTO);
    }
}
