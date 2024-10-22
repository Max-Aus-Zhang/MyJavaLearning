package com.max.xianchenwork;

public class WeatherTest {
    public static void main(String[] args) {

        Weather weather = new Weather();
        Thread generateT= new Thread(new GenerateWeather(weather));
        Thread readT= new Thread(new ReadWeather(weather));
        generateT.start();
        readT.start();


        try {
            generateT.join(); // 等待生成线程结束
            readT.join();     // 等待读取线程结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
