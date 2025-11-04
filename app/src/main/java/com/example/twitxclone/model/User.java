package com.example.twitxclone.model;

public class User {

    private String username;
    private String dob;
    public static final String U_KEY = "user";
    public static final String D_KEY = "birth";

    public String getUsername(){
       return username;
    }

    public void setUsername (String username){
        this.username = username;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }
}
