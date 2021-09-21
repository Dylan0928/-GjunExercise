package com.example;

public class Cat extends Animal {    
    private String name;
    
    public Cat() {
        super(4);
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
