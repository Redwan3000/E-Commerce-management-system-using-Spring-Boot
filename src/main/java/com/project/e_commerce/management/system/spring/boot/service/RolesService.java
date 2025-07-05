package com.project.e_commerce.management.system.spring.boot.service;

import com.project.e_commerce.management.system.spring.boot.DTO.RolesDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Roles;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.RolesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class RolesService {
    private RolesRepository rolesRepository;

    public void setRole(RolesDTO rolesDTO)  {

        Roles roles = new Roles();
        roles.setRole_name(rolesDTO.getRole_name());
        Set<Users> usersSet = new HashSet<>();
        usersSet.add(new Users());

        rolesRepository.save(roles);
    }


}
