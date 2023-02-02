package com.codegym.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private Category category;

    public Customer() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Customer(int id, String name, String email, String address, Category category) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
