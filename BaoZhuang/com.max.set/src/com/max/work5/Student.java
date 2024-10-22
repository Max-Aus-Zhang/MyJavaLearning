package com.max.work5;

import java.util.Objects;

public class Student{
    //根据需求完成Student类的定义
    private int stuid;
    private String name;
    private float score;

    //get & set
    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Student(float score, String name, int stuid) {
        this.score = score;
        this.name = name;
        this.stuid = stuid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号=" + stuid +
                ",姓名='" + name + '\'' +
                ", 成绩=" + score +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass()!= obj.getClass()){
            return false;
        }
        if (obj.getClass() == Student.class){
            Student student = (Student) obj;
            return student.getName().equals(name) && student.getStuid() == stuid;
        }
        return false;
    }
}