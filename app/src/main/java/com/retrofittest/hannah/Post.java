package com.retrofittest.hannah;

import com.google.gson.annotations.SerializedName;

public class Post {

    private String firstName;

    private String secondName;

    //@SerializedName("gender")
    private String gender;

    public Post(String firstName, String secondName, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }
}
