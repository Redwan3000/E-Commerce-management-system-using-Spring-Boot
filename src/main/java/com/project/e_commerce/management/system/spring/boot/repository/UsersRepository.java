package com.project.e_commerce.management.system.spring.boot.repository;

import com.project.e_commerce.management.system.spring.boot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
