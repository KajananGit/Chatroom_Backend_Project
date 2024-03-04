package com.example.chatroom_gp2.models;

import jakarta.persistence.*;
import org.apache.logging.log4j.message.Message;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chatrooms")
public class Chatroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "age_limit")
    private int ageLimit;

    @OneToMany(mappedBy = "chatroom")
    private List<Message> messages;

    public Chatroom(String name, int capacity, int ageLimit){
        this.name = name;
        this.capacity = capacity;
        this.ageLimit = ageLimit;
        this.messages = new ArrayList<>();
    }
    public Chatroom(){}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeLimit() {
        return this.ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
