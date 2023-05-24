package com.example.crud_spring_boot.service;

import com.example.crud_spring_boot.dao.UserDAO;
import com.example.crud_spring_boot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) { this.userDAO = userDAO; }

    @Override
    public List<User> allUsers() {
        return userDAO.findAll();
    }

    @Transactional(readOnly = false)
    @Override
    public void add(User user) {
        userDAO.save(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(long id) {
        userDAO.deleteById(id);
    }

    @Transactional(readOnly = false)
    @Override
    public void edit(User user, long id) {
        userDAO.save(user);
    }
    @Override
    public Optional<User> getUserById(long id) {
        return userDAO.findById(id);
    }
}
