package com.max.inheritance.demo1;

public class Employee {
    private int id;
    private String name;
    private String duty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void work (){
        System.out.println("Employee " + id + " is working.");
    }


}
