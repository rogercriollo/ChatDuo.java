package com;

import java.time.LocalDateTime;

public class Imagen extends Message implements Validable {
    private long size;
    private int width;
    private int height;

    public Imagen(LocalDateTime createdAt, long size, int width, int height) {
        super(createdAt);
        this.size = size;
        this.width = width;
        this.height = height;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void validate() {
        if (this.size > 1000000){
         this.width = 1000;
         this.height = 1000;
         this.size = this.width * this.height;

        }

    }
}
