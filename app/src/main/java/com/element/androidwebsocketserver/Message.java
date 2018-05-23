package com.element.androidwebsocketserver;

import java.util.Date;

public class Message {

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    private String content;
    private String sender;
    private Date received;

    // getters and setters

}
