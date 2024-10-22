package com.max.stringdemo;

import java.util.Scanner;
// 账户密码认证

public class StringDemo1 {
    public static void main(String[] args) {
        String name="zhangshan";
        String pwd="123";



        int flag=3;
        while(flag>0){
            System.out.println("input name");
            Scanner sc=new Scanner(System.in);
            String username = sc.next();
            System.out.println("input password");
            String password = sc.next();

            if(username.equals(name) && password.equals(pwd)){
                System.out.println("correct!");
            }
            else {
                System.out.println("incorrect!");
                flag--;
            }
            System.out.println("wrong, u still have "+flag+" times to log in");
        }


        }


}
