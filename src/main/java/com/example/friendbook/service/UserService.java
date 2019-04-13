package com.example.friendbook.service;

import com.example.friendbook.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUsersList();
    public User saveUser(User user);
    public User findUser(String username, String password);

}
