package com.example.RestApi_User_Service.repository;
import com.example.RestApi_User_Service.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
