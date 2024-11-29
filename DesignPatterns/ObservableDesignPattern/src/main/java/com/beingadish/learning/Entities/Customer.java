package com.beingadish.learning.Entities;

public class Customer {

    private static Integer customerId = 0;

    private final Integer id;
    private String name;

    public Customer(String name) {
        this.id = ++customerId;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
