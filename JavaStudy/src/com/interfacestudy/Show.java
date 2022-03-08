package com.interfacestudy;

public class Show {
    public void print(Shape s) {
        System.out.println("面积是：" + s.area());
        System.out.println("周长是：" + s.perimeter());
    }
}
