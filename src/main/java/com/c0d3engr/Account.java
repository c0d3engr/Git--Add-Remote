package com.c0d3engr;

import java.util.Objects;

// Create model entity class Account to store accounts
public class Account {

    // 1 Declared instance variables
    private Integer id;
    private String name;
    private String email;

    // 2 Created constructor
    public Account(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // 3 Created getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 4 created equals() and hashcode(); toString() not advisable when working with Spring Data JPA
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(email, account.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
