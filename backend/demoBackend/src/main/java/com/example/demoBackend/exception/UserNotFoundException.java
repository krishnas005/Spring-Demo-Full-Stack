package com.example.demoBackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Count not find user with given Id: " + id);
    }
}
