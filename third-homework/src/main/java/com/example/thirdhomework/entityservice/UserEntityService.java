package com.example.thirdhomework.entityservice;

import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.exception.UserIsNotExistException;
import com.example.thirdhomework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserEntityService {

    private final UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public User findById(Long id)
    {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent())
        {
            return optionalUser.get();
        }
        return null;
    }

}
