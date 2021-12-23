package com.example.thirdhomework.exception;

public class CommentIsNotExistException extends RuntimeException{
    public CommentIsNotExistException(String message) {
        super(message);
    }
}
