package com.exam.entity;

public class Login {
    private Integer username; //账号（id号）
    private String password;  //密码

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
