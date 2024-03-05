package com.example.chatroom_gp2.repositories;

import com.example.chatroom_gp2.components.DataLoader;
import com.example.chatroom_gp2.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    //messages in a specific chatroom
    List<Message> findByChatroomId(long id);

    //messages from a specific user
    List<Message> findByUserId(long id);

    //messages that contains a given content/text
    List<Message> findByContentContains(String content);

}
