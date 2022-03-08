package com.interfacestudy;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(10.0);
        System.out.println("圆的面积是：" + s1.area());
        System.out.println("圆的周长是：" + s1.perimeter());

        Shape s2 = new Rectangle(10.0, 20.0);
        System.out.println("矩形的面积是：" + s2.area());
        System.out.println("矩形的周长是：" + s2.perimeter());

        // 使用接口回调最大的好处是可以灵活地将接口类型参数替换为需要的具体的类
        Show s = new Show();
        // 接口回调
        s.print(new Circle(10.0));
        s.print(new Rectangle(10.0, 20.0));
    }
}
