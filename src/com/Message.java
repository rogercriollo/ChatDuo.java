package com;

import java.time.LocalDateTime;

public class Message {
    private LocalDateTime createdAt;


    public void validate(Validable validable){
        validable.validate();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Message(LocalDateTime createdAt) {
        this.createdAt = createdAt;

    }


}
