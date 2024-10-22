package com.max.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest{



    public static void main(String[] args){
        //定义Employee类的对象
    Employee employee1 = new Employee("emp001","Jack",1800.0f);
        Employee employee2 = new Employee("emp002","Lee",2500.0f);
        Employee employee3 = new Employee("emp001","Wood",1600.0f);

        //将对象添加到List中
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        //输出排序前的数据
     for(Employee employee : employees){
         System.out.println(employee);
     }

        //排序
        System.out.println("排序后");
        Collections.sort(employees);


        //输出排序后的数据
        for(Employee employee : employees){
            System.out.println(employee);
        }

    }
}