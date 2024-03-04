package com.example.chatroom_gp2.controllers;

import com.example.chatroom_gp2.services.ChatroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatrooms")
public class ChatroomController {

    @Autowired
    ChatroomService chatroomService;

}
