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

import java.time.LocalDate;

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
        User user1 = new User("Harun", "Harun@gmail.com", LocalDate.of(2002, 10, 12));
        User user2 = new User("Zakaria", "Zakaria007@outlook.com", LocalDate.of(2001, 6, 25));
        User user3 = new User("Laura", "Laura@live.com", LocalDate.of(1995, 11, 07));
        User user4 = new User("Maya", "Maya@gmail.com", LocalDate.of(2000, 8, 05));
        User user5 = new User("Kajanan", "Kajanan@Hotmail.com", LocalDate.of(1999, 3, 10));

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);

        // MESSAGES




    }



}
