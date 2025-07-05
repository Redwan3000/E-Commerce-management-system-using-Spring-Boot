package com.project.e_commerce.management.system.spring.boot.controller;

import com.project.e_commerce.management.system.spring.boot.DTO.RolesDTO;
import com.project.e_commerce.management.system.spring.boot.DTO.UsersDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Roles;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.RolesRepository;
import com.project.e_commerce.management.system.spring.boot.service.RolesService;
import com.project.e_commerce.management.system.spring.boot.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RolesController {



        private final UsersService usersService;
        private final RolesService rolesService;



        @PostMapping("/admin/set_role")
        public void setRole(@RequestBody RolesDTO rolesDTO) {

            rolesService.setRole(rolesDTO);
        }

        @GetMapping("/admin/print_allRoles")
        public List<UsersDTO> getUsersByRole(@RequestBody String roleName) {
            return usersService.getUsersByRoleName(roleName);
        }



    }
