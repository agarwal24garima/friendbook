package com.example.friendbook.service;

import com.example.friendbook.entity.UserFriends;

import java.util.List;

public interface UserFriendServcie {

    public List<UserFriends> getUserFriendsList();
    public UserFriends saveUser(UserFriends userFriends);
    public void deleteUserFriend(UserFriends userFriends);
}
