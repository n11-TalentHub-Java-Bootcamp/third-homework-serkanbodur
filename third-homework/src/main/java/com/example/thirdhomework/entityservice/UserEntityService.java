package com.example.thirdhomework.entityservice;

import com.example.thirdhomework.entity.ProductComment;
import com.example.thirdhomework.entity.User;

import java.util.List;

public interface UserEntityService {
    List<User> findAll();
    User findById(String id);
    User save(User user);
    void deleteById(String id);
}
