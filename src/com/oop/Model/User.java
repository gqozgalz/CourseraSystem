package com.oop.Model;

public class User {
    public String userName;
    public String email;
    public String password;
    public  User(){

    }
    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
