package com.example.userservice.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() {
        super("Пользователь не найден!");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
