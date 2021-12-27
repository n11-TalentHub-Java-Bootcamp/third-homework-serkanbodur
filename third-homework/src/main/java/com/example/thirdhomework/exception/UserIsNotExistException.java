package com.example.thirdhomework.exception;

public class UserIsNotExistException extends RuntimeException{
    public UserIsNotExistException(String message) {
        super(message);
    }
}
