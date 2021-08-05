package com;

import java.time.LocalDateTime;


public class Contact {
    private String name;
    private  String phoneNumber;
    private String statusMessage;
    private LocalDateTime lastConnect;

    public Contact(String name, String phoneNumber, String statusMessage, LocalDateTime lastConnect) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.statusMessage = statusMessage;
        this.lastConnect = lastConnect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public LocalDateTime getLastConnect() {
        return lastConnect;
    }

    public void setLastConnect(LocalDateTime lastConnect) {
        this.lastConnect = lastConnect;
    }
}
