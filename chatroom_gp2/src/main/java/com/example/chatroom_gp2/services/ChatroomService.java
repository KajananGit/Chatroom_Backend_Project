package com.example.chatroom_gp2.services;


import com.example.chatroom_gp2.models.Chatroom;
import com.example.chatroom_gp2.repositories.ChatroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatroomService {

    @Autowired
    ChatroomRepository chatroomRepository;


    public Chatroom saveChatroom(Chatroom chatroom){
        return chatroomRepository.save(chatroom);
    }

    public Chatroom getChatroomById(long id){
        return chatroomRepository.findById(id).get();
    }

//    public List<Chatroom> getAllChatrooms(){
//        return chatroomRepository.findAll();
//    }
//
////    public Chatroom updateChatroom(Chatroom chatroom){
////
////    }
//

//
//    public void deleteChatroom(long id){
//        chatroomRepository.deleteById(id);
//    }

}
