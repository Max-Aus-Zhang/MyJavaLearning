package com.max.comparable;

//实现Comparable接口
public class Employee implements Comparable<Employee>{
    //成员变量
    private String id;
    private String Name;
    private float Salary;


    //构造方法


    public Employee(String id, String name, float salary) {
       this.setId(id);
       this.setName(name);
       this.setSalary(salary);
    }

    public Employee(String id) {
    }


    //getter和setter方法


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    //toString()方法
    public String toString() {
        return "ID: " + this.getId() + ", Name: " + this.getName()+ ", Salary: " + this.getSalary();
    }

    @Override
    public int compareTo(Employee o) {
        float salary1=this.getSalary();
        float salary2=o.getSalary();
        return new Double(salary2-salary1).intValue();
    }
}