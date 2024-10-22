package com.max.xianchen;

public class Demo extends Thread{
    public void run(){
      for(int i=1;i<=5;i++){
          System.out.println("机器正在打印"+getName()+i);
      }


    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
    }
}
