package com.lwh.observer.guava;


public class Question {

    private String userName;
    private String content;
    private String gperName;

    public String getGperName() {
        return gperName;
    }

    public void setGperName(String gperName) {
        this.gperName = gperName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
