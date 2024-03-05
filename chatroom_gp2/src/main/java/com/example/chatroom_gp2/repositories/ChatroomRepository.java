package com.example.chatroom_gp2.repositories;

import com.example.chatroom_gp2.models.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {

    @Query ("SELECT m.chatroom FROM Message m ORDER BY m.messageDateTime DESC")
    List<Chatroom> findChatroomByMostRecentMessage();

}
