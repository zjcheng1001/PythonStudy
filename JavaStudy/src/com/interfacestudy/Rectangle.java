package com.interfacestudy;

// Rectangle类实现Shape接口
public class Rectangle implements Shape {
    double a;       // 长或宽
    double b;       // 长或宽
    // 定义Rectangle类的构造方法
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double area() {
        return a * b;
    }
    public double perimeter() {
        return 2 * (a + b);
    }
}
