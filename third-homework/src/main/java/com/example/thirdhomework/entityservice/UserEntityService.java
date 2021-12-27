package com.example.thirdhomework.entityservice;

import com.example.thirdhomework.dto.UserDTO;
import com.example.thirdhomework.entity.ProductComment;
import com.example.thirdhomework.entity.User;

import java.util.List;

public interface UserEntityService {
    List<UserDTO> findAll();
    UserDTO findById(String id);
    UserDTO save(UserDTO userDTO);
    void deleteById(String id);
}
