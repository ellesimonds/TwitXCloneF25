package com.example.twitxclone.model;

public class User {

    private String email;
    private String dob;
    public static final String U_KEY = "EMAIL";
    public static final String D_KEY = "BIRTH";

    public String getEmail(){
       return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }
}
