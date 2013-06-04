package com.mengqiu.domain;


public class User {
    private String email;
    private String name;
    private String password;
    private Boolean isValid;

    public  User(){}

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
        return password;
    }
    public Boolean  getValidation(){
        return isValid;
    }
}
