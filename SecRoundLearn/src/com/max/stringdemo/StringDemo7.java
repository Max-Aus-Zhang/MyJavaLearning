package com.max.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        System.out.println("请输入数值:");
        String matchValue = "DEABC";
        Scanner sc = new Scanner(System.in);

        String inputValue = sc.nextLine();
        checkMatch(inputValue, matchValue);




    }

    public static Boolean checkMatch(String inputValue, String matchValue) {
        for (int i = 0; i < inputValue.length(); i++) {
            inputValue=rotate(inputValue);
            System.out.println(inputValue);
            if(inputValue.equals(matchValue)){

                System.out.println(inputValue+"数值与系统匹配");
                return true;
            }


        }
        System.out.println("数值不相等");
        return false;
    }

    public static String rotate(String inputValue ){
       char firstLetter = inputValue.charAt(0);
       String restLetter = inputValue.substring(1);
       return inputValue = restLetter+firstLetter ;
    }
}
