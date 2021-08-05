package com;

import java.time.LocalDateTime;
import java.util.List;

public class ChatGroup extends Chat{
    private List<Contact> reciever;
    private List<LocalDateTime> readAt;

    public ChatGroup(Contact sender,  List<Contact> reciever) {
        super(sender);
        this.reciever = reciever;
    }

    public List<Contact> getReciever() {
        return reciever;
    }

    public void setReciever(List<Contact> reciever) {
        this.reciever = reciever;
    }

    public List<LocalDateTime> getReadAt() {
        return readAt;
    }

    public void setReadAt(List<LocalDateTime> readAt) {
        this.readAt = readAt;
    }
}

