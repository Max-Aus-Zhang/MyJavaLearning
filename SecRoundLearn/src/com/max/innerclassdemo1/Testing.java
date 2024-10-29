package com.max.innerclassdemo1;

public class Testing {
    public static void main(String[] args) {
        Round round = new Round(10.0);

        Rectangle rectangle = new Rectangle(10.0, 20.0);

        System.out.println("圆的周长:");
        double area = round.getArea();
        System.out.println(area);
        System.out.println("圆的面积:");
        double perimeter = round.getPerimeter();
        System.out.println(perimeter);

        System.out.println("长方形的周长:");
        double area1=rectangle.getArea();
        System.out.println(area1);
        System.out.println("长方体面积");
        double perimeter1=rectangle.getPerimeter();
        System.out.println(perimeter1);
    }
}
