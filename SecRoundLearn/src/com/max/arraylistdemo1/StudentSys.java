package com.max.arraylistdemo1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSys {
    public static void main(String[] args) {
        ArrayList<Demo1Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("0.退出");
            System.out.println("请输入数字进行选择");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent(studentList);
                    break;
                case 2:
                    deleteStudent(studentList);
                    break;
                case 3:
                    updateStudent(studentList);
                    break;
                case 4:
                    getAllStudent(studentList);
                    break;
                case 0:
                    flag = false;

            }
        }
    }


    public static void addStudent(ArrayList<Demo1Student> studentList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入性别");
        String gender = sc.next();
        studentList.add(new Demo1Student(name, age, gender));


    }

    public static void deleteStudent(ArrayList<Demo1Student> studentList) {
        getAllStudent(studentList);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生名字:");
        String inputName = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(inputName)) {
                studentList.remove(i);
            }
        } System.out.println("并没有找到");
    }

    public static void updateStudent(ArrayList<Demo1Student> studentList) {
        getAllStudent(studentList);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生编号:");
        int indexNum = sc.nextInt();
        indexNum = indexNum - 1;
        Demo1Student editStudent = studentList.get(indexNum);
        boolean flag = true;
        while(flag){
            System.out.println("1.修改姓名");
            System.out.println("2.修改年龄");
            System.out.println("3.修改性别");
            System.out.println("0.取消");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("新的名字是:");
                    String newName=sc.next();
                    editStudent.setName(newName);
                    break;
                    case 2:
                        System.out.println("新的年龄是:");
                        int newAge=sc.nextInt();
                    editStudent.setAge(newAge);
                    break;
                case 3:
                    System.out.println("新的性别是:");
                    String newGender=sc.next();
                editStudent.setGender(newGender);
                break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确数字");;
            }
        }
    }

    public static void getAllStudent(ArrayList<Demo1Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
