package com.max.comparator;

public class Cat {
    private String name;
    private int age;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public Cat(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}

