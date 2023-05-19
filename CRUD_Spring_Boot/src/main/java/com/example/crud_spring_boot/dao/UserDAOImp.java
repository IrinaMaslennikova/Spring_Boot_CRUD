package com.example.crud_spring_boot.dao;

import com.example.crud_spring_boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {
    @PersistenceContext
    private final EntityManager entityManager;

    public UserDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> allUsers() {
        List<User> users = entityManager.createNativeQuery("SELECT * FROM User1", User.class).getResultList();
        return users;
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    @Override
    public void edit(User updateUser, long id) {
        entityManager.merge(updateUser);
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}
