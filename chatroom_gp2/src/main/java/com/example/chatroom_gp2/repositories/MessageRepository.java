package com.example.chatroom_gp2.repositories;

import com.example.chatroom_gp2.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
