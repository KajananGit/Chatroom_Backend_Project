package com.example.chatroom_gp2.controllers;

import com.example.chatroom_gp2.models.Chatroom;
import com.example.chatroom_gp2.services.ChatroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chatrooms")
public class ChatroomController {

    @Autowired
    ChatroomService chatroomService;

    @PostMapping
    public ResponseEntity<Chatroom> saveChatroom(@RequestBody Chatroom chatroom){
        Chatroom newChatroom = chatroomService.saveChatroom(chatroom);
        return new ResponseEntity<>(newChatroom, HttpStatus.CREATED);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Chatroom> getChatroomById(@PathVariable long id) {
        Chatroom chatroom = chatroomService.getChatroomById(id);
        return new ResponseEntity<>(chatroom, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Chatroom>> getAllChatRooms(){
        List<Chatroom> allChatrooms = chatroomService.getAllChatrooms();
        return new ResponseEntity<>(allChatrooms, HttpStatus.OK);
    }

    @PatchMapping
    


}
