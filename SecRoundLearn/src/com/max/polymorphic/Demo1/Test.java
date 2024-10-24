package com.max.polymorphic.Demo1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王",66);
        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(3,"橘");

        p.keepPet(dog,"狗屎");
        p.keepPet(cat,"鱼干");
    }
}
