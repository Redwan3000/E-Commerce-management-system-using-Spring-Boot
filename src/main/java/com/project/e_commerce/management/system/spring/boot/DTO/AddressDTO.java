package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data
public class AddressDTO {
    private String street;
    private String city;
    private String post_code;
    private int user_id;
}
