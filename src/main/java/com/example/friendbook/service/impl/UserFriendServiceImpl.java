package com.example.friendbook.service.impl;

import com.example.friendbook.entity.UserFriends;
import com.example.friendbook.repository.UserFriendRepository;
import com.example.friendbook.service.UserFriendServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFriendServiceImpl implements UserFriendServcie {

    @Autowired
    public UserFriendRepository userFriendRepository;

    @Override
    public List<UserFriends> getUserFriendsList() {
        return (List<UserFriends>)userFriendRepository.findAll();
    }

    @Override
    public UserFriends saveUser(UserFriends userFriends) {
        return userFriendRepository.save(userFriends);
    }

    @Override
    public void deleteUserFriend(UserFriends userFriends) {
        userFriendRepository.delete(userFriends);
    }
}
