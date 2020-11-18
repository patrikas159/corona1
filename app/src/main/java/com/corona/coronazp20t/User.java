package com.corona.coronazp20t;

public class User {
    // 1 objekto pozymiai(argumentai, kintamieji)
    private String username;
    private String password;
    private String email;

    //klases konstruktoriai
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }
    // geteriai ir seteriai
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}