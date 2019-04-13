package com.example.friendbook.service.impl;

import com.example.friendbook.entity.User;
import com.example.friendbook.repository.UserRepository;
import com.example.friendbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getUsersList() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
