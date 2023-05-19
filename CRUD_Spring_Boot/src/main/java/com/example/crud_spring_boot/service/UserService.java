package com.example.crud_spring_boot.service;

import com.example.crud_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user, long id);

    User getUserById(long id);
}
