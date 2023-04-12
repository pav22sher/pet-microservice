package com.example.userservice.service;

import com.example.userservice.exception.UserNotFoundException;
import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceIml implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> get() {
        return userRepository.findAll();
    }

    @Override
    public User getById(String userId) {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public User save(User user) {
        String userId = UUID.randomUUID().toString();
        user.setId(userId);
        return userRepository.save(user);
    }

}
