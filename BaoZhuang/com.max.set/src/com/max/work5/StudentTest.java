package com.max.work5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class StudentTest {
    public static void main(String[] args) {
        //定义三个Student类的对象及一个HashSet类的对象
Student one = new Student(65,"Will",3);
        Student two = new Student(87,"Tom",1);
        Student three = new Student(95,"Lucy",2);

        //将Student类的对象添加到集合中
Set set = new HashSet();
set.add(one);
set.add(two);
set.add(three);
Iterator iterator = set.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}


        //使用迭代器显示Student类的对象中的内容
        System.out.println("添加重复数据测试");

        Student four = new Student(65,"Will",3);
        set.add(four);
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}