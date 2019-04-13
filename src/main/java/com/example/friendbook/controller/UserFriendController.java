package com.example.friendbook.controller;

import com.example.friendbook.entity.UserFriends;
import com.example.friendbook.service.UserFriendServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFriendController {

    @Autowired
    public UserFriendServcie userFriendServcie;

    @RequestMapping(value ="/friend", method = RequestMethod.GET)
    public ResponseEntity<List<UserFriends>> getUserFriendList(){
        return new ResponseEntity<List<UserFriends>>(userFriendServcie.getUserFriendsList(), HttpStatus.OK);
    }

    @RequestMapping(value ="/friend", method = RequestMethod.POST)
    public ResponseEntity<UserFriends> saveUserfriend(@RequestBody UserFriends userFriends){
        return new ResponseEntity<UserFriends>(userFriendServcie.saveUser(userFriends), HttpStatus.OK);
    }

    @RequestMapping(value ="/friend", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUserfriend(@RequestBody UserFriends userFriends){
        userFriendServcie.deleteUserFriend(userFriends);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
