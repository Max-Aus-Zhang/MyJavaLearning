package com.max.interfacedemo1;

public class Bird extends Animal {
    public Bird() {

    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating fruits");
    }

}
