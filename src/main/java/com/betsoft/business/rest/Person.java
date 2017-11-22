package com.betsoft.business.rest;

/**
 * Created by MCKM on 12.10.2017.
 */
public class Person {
    private String username;
    private String firstName;
    private String secondName;
    private String email;

    public Person(String username, String firstName, String secondName, String email) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
