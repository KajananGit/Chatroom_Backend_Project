package com.example.chatroom_gp2.models;

import java.time.LocalDateTime;

public class MessageDTO {

    private String content;
    private LocalDateTime messageDateTime;

    public MessageDTO(String content, LocalDateTime messageDateTime) {
        this.content = content;
        this.messageDateTime = messageDateTime;
    }

    public MessageDTO(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(LocalDateTime messageDateTime) {
        this.messageDateTime = messageDateTime;
    }
}
