package com.max.xianchenwork;

public class GenerateWeather implements Runnable{
    Weather weather;


    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            weather.generate();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
