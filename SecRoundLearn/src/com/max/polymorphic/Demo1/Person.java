package com.max.polymorphic.Demo1;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet (Animal animal, String food){
        System.out.print("年龄为"+age+"岁的"+name+"养了一只"+animal.getcolor()+"颜色的"+animal.getAge()+"岁的宠物,它"
        );
        animal.eat(food);
    }
}
