package com.example.thirdhomework.controller;

import com.example.thirdhomework.entityservice.UserEntityService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
