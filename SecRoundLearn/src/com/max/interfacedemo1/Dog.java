package com.max.interfacedemo1;

public class Dog extends Animal implements Swin{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating bone");
    }

    @Override
    public void swinming() {
        System.out.println(this.getName() + " is swinging lololo");
    }
}
