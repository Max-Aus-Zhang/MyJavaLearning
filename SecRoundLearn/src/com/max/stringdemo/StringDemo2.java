package com.max.stringdemo;
/*
* 字符串拼接
* */
public class StringDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String result = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ",";
            }
        }
        result = result + "]";
        System.out.println(result);
    }
}
