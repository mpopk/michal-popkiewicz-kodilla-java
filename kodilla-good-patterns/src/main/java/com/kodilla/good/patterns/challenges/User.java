package com.kodilla.good.patterns.challenges;

public class User {
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    private String name;

    public User(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
}
