package com.example.thirdhomework.controller;

import com.example.thirdhomework.dto.UserDTO;
import com.example.thirdhomework.entity.User;
import com.example.thirdhomework.entityservice.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users/")
public class UserController {

    private final UserEntityService userEntityService;

    @GetMapping("")
    public ResponseEntity<List<UserDTO>> findAllUsers() {
        var userDTOs = userEntityService.findAll();
        return new ResponseEntity<>(userDTOs,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        var userDTO = userEntityService.findById(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        var responseUserDTO = userEntityService.save(userDTO);
        return new ResponseEntity<>(responseUserDTO, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteById(@RequestParam String id) {
        userEntityService.deleteById(id);
        return ResponseEntity.ok("The user was deleted as successfully");
    }

}
