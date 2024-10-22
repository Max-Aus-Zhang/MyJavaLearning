package com.max.work3;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList <Object> list = new ArrayList<>();

        //创建三个Employee类的对象
        Employee one=new Employee(01,"张三",5000);
        Employee two=new Employee(02,"李四",5500);
        Employee three=new Employee(03,"赵六",4000);

        //添加员工信息到ArrayList中
        list.add(one);
        list.add(two);
        list.add(three);

        //显示员工的姓名和薪资
        System.out.println("员工姓名\t员工薪水");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(((Employee)(list.get(i))).getName()+"\t\t"+((Employee)(list.get(i))).getSalary()); ;
        }
    }
}