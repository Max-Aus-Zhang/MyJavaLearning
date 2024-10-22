package com.max.arraylistdemo1;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Demo1Student> al = new ArrayList<>();

        Demo1Student d1 = new Demo1Student("Peter", 16, "Male");
        Demo1Student d2 = new Demo1Student("Rose", 17, "Female");
        Demo1Student d3= new Demo1Student("Jack", 16, "Male");
        Demo1Student d4 = new Demo1Student("Eliz", 17, "Female");
        Demo1Student d5 = new Demo1Student("Simon", 15, "Male");
        Demo1Student d6 = new Demo1Student("Kat", 17, "Female");


     al.add(d1);
     al.add(d2);
     al.add(d3);
     al.add(d4);
     al.add(d5);
     al.add(d6);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }


    }
}
