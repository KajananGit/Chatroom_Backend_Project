package com.example.chatroom_gp2.controllers;


import com.example.chatroom_gp2.models.User;
import com.example.chatroom_gp2.models.UserDTO;
import com.example.chatroom_gp2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
        public ResponseEntity<User> getUserByID(@PathVariable long id){
            return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.saveUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@RequestBody UserDTO userDTO, @PathVariable long id){
        return new ResponseEntity<>(userService.updateUser(userDTO, id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteUserById(@PathVariable long id){
        userService.deleteUserById(id);
        return  new ResponseEntity<>(id, HttpStatus.OK );
    }

}

