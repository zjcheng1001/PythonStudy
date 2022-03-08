package com.interfacestudy;

// Circle类实现Shape接口
public class Circle implements Shape {
    double radius;      // 半径
    // 定义构造方法
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
