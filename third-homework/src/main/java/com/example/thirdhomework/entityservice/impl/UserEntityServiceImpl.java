package com.example.thirdhomework.entityservice.impl;

import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.entityservice.UserEntityService;
import com.example.thirdhomework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserEntityServiceImpl implements UserEntityService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }

    public User save(User user) {
        user = userRepository.save(user);
        return user;
    }

    public void deleteById(String id)
    {
        userRepository.deleteById(id);
    }

}
