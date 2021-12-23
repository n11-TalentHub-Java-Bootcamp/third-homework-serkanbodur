package com.example.thirdhomework.controller;

import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.entityservice.UserEntityService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users/")
public class UserController {

    private final UserEntityService userEntityService;

    @GetMapping("")
    public MappingJacksonValue findAllUserList()
    {
        var userList = userEntityService.findAll();
        var mapping = new MappingJacksonValue(userList);
        return mapping;
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id)
    {
        var user = userEntityService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
