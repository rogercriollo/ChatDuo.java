package com;

import java.util.*;

public class Chat{

    private Contact sender;
    private List<Message> messages;



    public Chat(Contact sender) {
        this.sender = sender;
        this.messages = new ArrayList<Message>();
    }

    public Contact getSender() {
        return sender;
    }

    public void setSender(Contact sender) {
        this.sender = sender;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }
}


