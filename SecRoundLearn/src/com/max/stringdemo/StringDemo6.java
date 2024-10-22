package com.max.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
//        check num
        while (true) {
            System.out.println("plz input num");

            s = sc.next();

            boolean result = checkValue(s);
            if (result) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("请输入正确数值");
                continue;
            }
        }
//        check num
StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
          char ch =s.charAt(i);
          int num = ch - 48;

            String temp = getNumLetter(num);
            sb.append(temp);
        }
        System.out.println(sb);

    }

    public static String getNumLetter(int num) {
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[num];
    }


    public static boolean checkValue(String s) {
        if (s.length() > 9) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }

        }


        return true;
    }

}
