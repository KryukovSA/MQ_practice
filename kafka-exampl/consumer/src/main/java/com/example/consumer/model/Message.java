package com.example.consumer.model;

public class Message {

    private String message;
    private Integer age;

    public Message() {
    }

    public Message(String message, Integer age) {
        this.message = message;
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", age=" + age +
                '}';
    }
}
