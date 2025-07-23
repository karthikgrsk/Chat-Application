package com.chat.app.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private int id;
    private int sender;
    private String content;
}
