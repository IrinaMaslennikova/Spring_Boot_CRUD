package com.example.crud_spring_boot.service;

import com.example.crud_spring_boot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(long id);

    void edit(User user, long id);

    Optional<User> getUserById(long id);
}
