package com.hiberus.techtest.util;

public enum Status {

    SENT("Sent"),
    ERROR("Error");

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    Status(String action) {
        this.action = action;
    }
}
