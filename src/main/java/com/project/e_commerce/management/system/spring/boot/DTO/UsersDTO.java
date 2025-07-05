package com.project.e_commerce.management.system.spring.boot.DTO;

import lombok.Data;

@Data

public class UsersDTO {
    private int id;
    private String name;
    private String password;
    private String email;
    private String role_name;

}
