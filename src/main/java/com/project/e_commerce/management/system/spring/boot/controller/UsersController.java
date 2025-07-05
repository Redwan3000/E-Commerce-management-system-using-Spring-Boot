package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.UsersDTO;
import com.project.e_commerce.management.system.spring.boot.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {


    private final UsersService usersService;

    @PostMapping("/user/add_users")
    public void createUser(@RequestBody UsersDTO usersDTO) {
        usersService.addUser(usersDTO);
    }

    @GetMapping("/user/get_user/{roleName}")
    public List<UsersDTO> getUsersByRole(@PathVariable String roleName) {
        return usersService.getUsersByRoleName(roleName);
    }

    @DeleteMapping("/admin/del_User/{id}")
    public void deleteUser(@PathVariable int id) {
        usersService.delUser(id);
    }

}
