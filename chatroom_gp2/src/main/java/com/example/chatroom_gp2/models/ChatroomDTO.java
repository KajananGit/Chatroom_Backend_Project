package com.example.chatroom_gp2.models;

import java.util.ArrayList;
import java.util.List;

public class ChatroomDTO {

    private String name;
    private int capacity;
    private int ageLimit;
//    private List<Long> messageIds;

    public ChatroomDTO() {}

    public ChatroomDTO(String name, int capacity, int ageLimit) {
        this.name = name;
        this.capacity = capacity;
        this.ageLimit = ageLimit;
//        this.messageIds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

//    public List<Long> getMessageIds() {
//        return messageIds;
//    }
//
//    public void setMessageIds(List<Long> messageIds) {
//        this.messageIds = messageIds;
//    }
}
