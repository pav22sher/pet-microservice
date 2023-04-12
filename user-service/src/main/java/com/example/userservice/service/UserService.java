package com.example.userservice.service;

import com.example.userservice.model.User;

import java.util.List;

public interface UserService {
    List<User> get();
    User getById(String userId);
    User save(User user);
}
