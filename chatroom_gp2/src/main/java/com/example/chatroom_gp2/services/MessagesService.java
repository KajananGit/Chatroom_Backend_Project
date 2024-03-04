package com.example.chatroom_gp2.services;


import com.example.chatroom_gp2.models.Chatroom;
import com.example.chatroom_gp2.models.Message;
import com.example.chatroom_gp2.models.MessageDTO;
import com.example.chatroom_gp2.models.User;
import com.example.chatroom_gp2.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessagesService {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    ChatroomService chatroomService;

    @Autowired
    UserService userService;

//    public Message createMessae(Message message){
//        return messageRepository.save(message);
//    }
//
    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    public Optional<Message> findMessage(long id){
        return messageRepository.findById(id);
    }
//
////    public Message getMessageByUserId(long userId){
////
////    }
////
////    public Message getMessageByChatroomId(long userId){
////
////    }
////
////    public Message editMessage(long id){
////
////    }
//
//    public void deleteMessage(long id){
//        messageRepository.deleteById(id);
//    }

   public Message saveMessage(MessageDTO messageDTO){
       Chatroom chatroom = chatroomService.getChatroomById(messageDTO.getChatroomId());
       User user = userService.getUserById(messageDTO.getUserId());
       Message message = new Message(messageDTO.getContent(), chatroom, user);
       messageRepository.save(message);
       return message;
   }

   public List<Message> findAllMessages(){
        return messageRepository.findAll();
   }

   public Message updateMessage(MessageDTO messageDTO, long id){
        Message messageUpdate = messageRepository.findById(id).get();
        Chatroom chatroom = chatroomService.getChatroomById(messageDTO.getChatroomId());
        User user = userService.getUserById(messageDTO.getUserId());
        messageUpdate.setChatroom(chatroom);
        messageUpdate.setUser(user);
        messageUpdate.setContent(messageDTO.getContent());
        messageRepository.save(messageUpdate);
        return messageUpdate;
   }

   public void deleteMessage(long id){
      messageRepository.deleteById(id);
   }

}
