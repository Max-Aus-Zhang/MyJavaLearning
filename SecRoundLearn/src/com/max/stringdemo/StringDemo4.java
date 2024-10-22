package com.max.stringdemo;

public class StringDemo4 {
    public static void main(String[] args) {
        String num="18106033777";

        String startNum= num.substring(0,3);
        String endNum= num.substring(7);

        String finalNum= startNum+"****"+endNum;
        System.out.println(finalNum);

        String id="350102199210053215";
        String year= id.substring(6,10);
        System.out.println("身份信息");
        System.out.print(year+"年");
        String month=id.substring(10,12);
        System.out.print(month+"月");
        String day=id.substring(12,14);
        System.out.println(day+"日");


        char gender = id.charAt(16);
        if(gender % 2 ==0){
            System.out.println("女");
        }else{
            System.out.println("男");
        }
    }
}
