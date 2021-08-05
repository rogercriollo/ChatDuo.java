package com;

import java.time.LocalDateTime;

public class Video extends Message implements Validable{
    private long length;
    private String resolution;

    public Video(LocalDateTime createdAt, long length, String resolution) {
        super(createdAt);
        this.length = length;
        this.resolution = resolution;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void validate() {
        if (this.length > 30 ){
            this.length = 30;
        }

    }
}
