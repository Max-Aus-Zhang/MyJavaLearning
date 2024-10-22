package com.max.xianchenwork;

import java.util.Random;

public class Weather {
    private int temperature;
    private int humidity;
    boolean flag = true;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public synchronized void generate(){
        while (!flag){
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

        Random random = new Random();
        setTemperature(random.nextInt(41));
        setHumidity(random.nextInt(101));
        System.out.println("生成天气数据"+this);
        flag = false;
        notifyAll();
    }

    public synchronized void read(){
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("读取天气数据"+this);
        flag = true;
        notifyAll();

    }

    @Override
    public String toString() {
        return "天气数据{" +
                ", temperature=" + temperature + "°C,humidity=" + humidity+
                "%}";
    }
}
