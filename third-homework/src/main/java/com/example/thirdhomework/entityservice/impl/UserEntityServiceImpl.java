package com.example.thirdhomework.entityservice.impl;

import com.example.thirdhomework.converter.UserConverter;
import com.example.thirdhomework.dto.UserDTO;
import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.entityservice.UserEntityService;
import com.example.thirdhomework.exception.UserIsNotExistException;
import com.example.thirdhomework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserEntityServiceImpl implements UserEntityService {

    private final UserRepository userRepository;

    public List<UserDTO> findAll() {
        var users = userRepository.findAll();
        if(users.isEmpty()) {
            throw new UserIsNotExistException("There is no user to show!");
        }
        return UserConverter.INSTANCE.convertAllUsersToUserDTOs(users);
    }

    public UserDTO findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!(optionalUser.isPresent())) {
            throw new UserIsNotExistException(("The user with " + id + " id number is not found!"));
        }
        return UserConverter.INSTANCE.convertUserToUserDTO(optionalUser.get());
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        var user = UserConverter.INSTANCE.convertUserDTOToUser(userDTO);
        userRepository.save(user);
        return UserConverter.INSTANCE.convertUserToUserDTO(user);
    }

    public void deleteById(String id) {
        userRepository.findById(id).orElseThrow(() -> new UserIsNotExistException("The user with " + id + "id number is not found!"));
        userRepository.deleteById(id);
    }

}
