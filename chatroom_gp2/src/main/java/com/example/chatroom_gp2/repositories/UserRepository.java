package com.example.chatroom_gp2.repositories;

import com.example.chatroom_gp2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
