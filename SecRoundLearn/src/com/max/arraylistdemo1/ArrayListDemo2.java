package com.max.arraylistdemo1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Demo1Student d1 = new Demo1Student("Peter", 16, "Male");
        Demo1Student d2 = new Demo1Student("Rose", 17, "Female");
        Demo1Student d3 = new Demo1Student("Jack", 15, "Male");
        Demo1Student d4 = new Demo1Student("Eliz", 17, "Female");
        Demo1Student d5 = new Demo1Student("Simon", 15, "Male");
        Demo1Student d6 = new Demo1Student("Kat", 17, "Female");
        ArrayList<Demo1Student> list = new ArrayList<Demo1Student>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);

        System.out.println("plz input name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (search(name, list)) {
            System.out.println("Found student with name " + name+"index is "+ findIndex(name, list));

        } else {
            System.out.println("Not found student with name " + name);
        }

        System.out.println("all stu under 16");
        ArrayList<Demo1Student> result =  findStudent(list);
        for (Demo1Student student : result) {
            System.out.println(student.getName()+student.getAge());
        }

    }

    public static int findIndex(String name, ArrayList<Demo1Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
/*其实search方法可以什么都不写
*
* 直接
* return findIndex(name, list) != -1;
*
* true 就是有
*
* */
    public static boolean search(String name, ArrayList<Demo1Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                return true;
            }

        }
        return false;
    }

    public static ArrayList<Demo1Student>  findStudent(ArrayList<Demo1Student> list) {
        Demo1Student student = null;
        ArrayList<Demo1Student> matchedStudent = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()<=15){
                matchedStudent.add(list.get(i));
            }
        }

        return matchedStudent;
    }

}
