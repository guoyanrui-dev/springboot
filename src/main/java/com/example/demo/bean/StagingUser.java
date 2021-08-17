package com.example.demo.bean;

/**
 * @author guoyanrui on 2021/8/17
 */
public class StagingUser {
    private int user_id;
    private String token;
    private String token_client_salt;

    public StagingUser() {
    }

    public StagingUser(int user_id, String token, String token_client_salt) {
        this.user_id = user_id;
        this.token = token;
        this.token_client_salt = token_client_salt;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken_client_salt() {
        return token_client_salt;
    }

    public void setToken_client_salt(String token_client_salt) {
        this.token_client_salt = token_client_salt;
    }

    @Override
    public String toString() {
        return "StagingUser{" +
                "user_id=" + user_id +
                ", token='" + token + '\'' +
                ", token_client_salt='" + token_client_salt + '\'' +
                '}';
    }
}
