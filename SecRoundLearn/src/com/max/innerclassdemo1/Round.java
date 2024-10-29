package com.max.innerclassdemo1;

public class Round extends Shape {
    private double radius;
    final double PI = 3.14159265358979323846;

    public double getRadius() {
        return radius;
    }

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
