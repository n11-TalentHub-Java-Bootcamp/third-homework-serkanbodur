package com.example.thirdhomework.controller;

import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.entityservice.UserEntityService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    public ResponseEntity<User> save(@RequestBody User user)
    {
        var responseUser = userEntityService.save(user);
        return new ResponseEntity<>(responseUser, HttpStatus.CREATED);
    }
}
