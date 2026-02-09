package org.example.geminicall.dto;

public class resdto {

    private String message;
    private Object data;

    // No-args constructor
    public resdto() {
    }

    // All-args constructor
    public resdto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    // Getters & Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
