package com.max.polymorphic.Demo1;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food){
        System.out.println(super.getAge()+"岁的狗两只前腿死死的抱住"+food+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗狗会看家");
    }
}
