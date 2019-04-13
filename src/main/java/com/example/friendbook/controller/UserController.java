package com.example.friendbook.controller;

import com.example.friendbook.entity.User;
import com.example.friendbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friendbook")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<List<User>>(userService.getUsersList(), HttpStatus.OK);
    }

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.OK);
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public ResponseEntity<User> loginUser(@RequestParam String username, @RequestParam String password){
        User user = userService.findUser(username,password);
        if(user  ==null){
           return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }
}
