package com.example.chatroom_gp2.controllers;

import com.example.chatroom_gp2.models.Message;
import com.example.chatroom_gp2.models.MessageDTO;
import com.example.chatroom_gp2.services.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("messages")
public class MessageController {

    @Autowired
    MessagesService messagesService;

    @GetMapping
    public ResponseEntity<List<Message>> getAllMessages(){
        return new ResponseEntity<>(messagesService.getAllMessages(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable long id){
        Optional<Message> message = messagesService.findMessage(id);
        if (message.isPresent()){
            return new ResponseEntity<>(message.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

//    @PostMapping
//    public ResponseEntity<Message> postMessage(@RequestBody MessageDTO messageDTO){
//        messagesService.saveMessage(messageDTO);
//        return new ResponseEntity<>(messagesService.findAllMessages(), HttpStatus.CREATED);
//    }

}
