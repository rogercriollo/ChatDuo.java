package com;

import java.time.LocalDateTime;

public class ChatDuo extends Chat {
    private Contact reciever;
    private LocalDateTime readAt;

    public ChatDuo(Contact sender, Contact reciever) {
        super(sender);
        this.reciever = reciever;
    }

    public Contact getReciever() {
        return reciever;
    }

    public void setReciever(Contact reciever) {
        this.reciever = reciever;
    }

    public LocalDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }
}

