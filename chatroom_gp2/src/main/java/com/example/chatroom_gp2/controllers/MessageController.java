package com.example.chatroom_gp2.controllers;

import com.example.chatroom_gp2.services.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageController {

    @Autowired
    MessagesService messagesService;
}
