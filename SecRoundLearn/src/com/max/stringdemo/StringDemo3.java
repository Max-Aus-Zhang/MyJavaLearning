package com.max.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        System.out.println("plz input num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//判断数值正确性
        while (true) {


            if (num >= 0 && num <= 99999) {
                break;
            } else {
                System.out.println("plz input correct num!");
            }
        }

//        运用查表法+拼接字符串
        String result = "";
        while (true) {
            int ge = num % 10;
            String letter = getNumLetter(ge);
            num = num / 10;


            result = letter + result;

            if (num <= 0) {
                break;
            }
        }
//    补齐0
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            result = "零" + result;
        }
        System.out.println(result);
        //补单位
        String finalResult = "";
        String[] unit = {"百", "十", "万", "千", "百", "十", "元" };
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            finalResult =finalResult+ c+unit[i];
        }
        System.out.println(finalResult);
    }


    //中文表格方法
    public static String getNumLetter(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        return arr[num];

    }

}
