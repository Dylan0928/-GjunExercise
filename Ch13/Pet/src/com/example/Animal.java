package com.example;

public abstract class Animal {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("這種動物用 " + legs + " 隻腳走路.");
    }
    
}
