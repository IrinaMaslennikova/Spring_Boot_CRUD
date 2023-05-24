package com.example.crud_spring_boot.dao;

import com.example.crud_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {

}
