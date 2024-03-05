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


    @PostMapping
    public ResponseEntity<Message> saveMessage(@RequestBody MessageDTO messageDTO){
        Message message = messagesService.saveMessage(messageDTO);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

//
    @PatchMapping(value = "/{id}")
    public ResponseEntity<Message> updateMessage(@RequestBody MessageDTO messageDTO, @PathVariable long id){
        Optional<Message> message = messagesService.findMessage(id);
        if (message.isPresent()) {
            Message updatedMessage = messagesService.updateMessage(messageDTO, id);
            return new ResponseEntity<>(updatedMessage, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteMessage(@PathVariable long id){
        Optional<Message> message = messagesService.findMessage(id);
        if (message.isPresent()) {
            messagesService.deleteMessage(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }



}
