package com.mengqiu.domain;


public class User {
    private String name;
    private String email;
    private String getPassword;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return getPassword;
    }
}
