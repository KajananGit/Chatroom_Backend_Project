package com.example.chatroom_gp2.components;

import com.example.chatroom_gp2.models.Chatroom;
import com.example.chatroom_gp2.models.User;
import com.example.chatroom_gp2.repositories.ChatroomRepository;
import com.example.chatroom_gp2.repositories.MessageRepository;
import com.example.chatroom_gp2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChatroomRepository chatroomRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    MessageRepository messageRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        // CHATROOMS

        Chatroom chatroom1 = new Chatroom("Jibber-Jabber", 50, 18);
        chatroomRepository.save(chatroom1);

        Chatroom chatroom2 = new Chatroom("Animal Talk", 10, 12);
        chatroomRepository.save(chatroom2);

        Chatroom chatroom3 = new Chatroom("The Natterjacks", 15, 16);
        chatroomRepository.save(chatroom3);

        Chatroom chatroom4 = new Chatroom("Babble Boys", 30, 18);
        chatroomRepository.save(chatroom4);

        Chatroom chatroom5 = new Chatroom("Film Fanatics", 25, 16);
        chatroomRepository.save(chatroom5);

        // USERS


        // MESSAGES

    }



}
