package com.example.chatroom_gp2.repositories;

import com.example.chatroom_gp2.models.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {

}
