package com;

import java.time.LocalDateTime;
public class Text extends Message implements Validable {
    private String message;
    private long length;



    public Text(LocalDateTime createdAt, String message) {
        super(createdAt);
        this.message = message;
        this.length = message.length();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public void validate() {
        if (this.length > 2048) {
            this.message = this.message.substring(0, 2049);
        }
    }
}
