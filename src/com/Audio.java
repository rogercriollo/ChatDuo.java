package com;

import java.time.LocalDateTime;

public class Audio extends Message implements Validable {
    private long length;
    private String quality;

    public Audio(LocalDateTime createdAt, long length, String quality) {
        super(createdAt);
        this.length = length;
        this.quality = quality;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public void validate() {
        if (this.length > 60){
            this.length = 60;
        }
    }
}
