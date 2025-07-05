package com.project.e_commerce.management.system.spring.boot.service;


import com.project.e_commerce.management.system.spring.boot.DTO.UsersDTO;
import com.project.e_commerce.management.system.spring.boot.entity.Roles;
import com.project.e_commerce.management.system.spring.boot.entity.Users;
import com.project.e_commerce.management.system.spring.boot.repository.RolesRepository;
import com.project.e_commerce.management.system.spring.boot.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {

    private UsersRepository usersRepository;
    private RolesRepository rolesRepository;


    public void addUser(UsersDTO usersDTO) {
        Users user = new Users();
        user.setName(usersDTO.getName());
        user.setEmail(usersDTO.getEmail());
        user.setPassword(usersDTO.getPassword());

        Roles role = new Roles();
        role.setRole_name(usersDTO.getRole_name());
        role = rolesRepository.save(role);
        user.setRole(role);

        usersRepository.save(user);
    }



    public List<UsersDTO> getUsersByRoleName(String roleName) {
        List<Users> allUsers = usersRepository.findAll();
        List<UsersDTO> filteredUsers = new ArrayList<>();

        for (Users user : allUsers) {
            if (user.getRole() != null && user.getRole().getRole_name().equalsIgnoreCase(roleName)) {
                UsersDTO dto = new UsersDTO();
                dto.setId(user.getId());
                dto.setName(user.getName());
                dto.setEmail(user.getEmail());
                dto.setRole_name(user.getRole().getRole_name());
                filteredUsers.add(dto);
            }
        }

        return filteredUsers;
    }

    public void delUser(int userId){

        if(usersRepository.existsById(userId)){
            usersRepository.deleteById(userId);
        } else {
            System.out.println("User not found");
        }
    }


}

