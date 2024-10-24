package com.max.polymorphic.Demo1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge()+"岁的猫眯着眼侧着头吃"+food);
    }

    public void catchMouse(){
        System.out.println("猫猫抓老鼠");
    }
}
