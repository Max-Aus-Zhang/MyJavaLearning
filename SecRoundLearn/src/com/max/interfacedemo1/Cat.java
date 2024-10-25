package com.max.interfacedemo1;

public class Cat extends Animal implements Swin{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eat fishcake");
    }

    @Override
    public void swinming() {
        System.out.println(this.getName() + " is swimming");
    }
}
