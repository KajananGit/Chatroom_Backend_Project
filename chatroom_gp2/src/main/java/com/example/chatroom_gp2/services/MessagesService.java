package com.example.chatroom_gp2.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesService {

    @Autowired
    MessageRepository messageRepository;

    public Message createMessae(Message message){
        return messageRepository.save(message);
    }

    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    public Message getMessageById(long id){
        return messageRepository.findById(id);
    }

    public Message getMessageByUserId(long userId){

    }

    public Message getMessageByChatroomId(long userId){

    }

    public Message editMessage(long id){

    }

    public void deleteMessage(long id){
        messageRepository.deleteById(id);
    }

}
