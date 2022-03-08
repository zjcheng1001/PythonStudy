package com.object;

/**
 * 子类不能继承父类的构造方法。如果父类的构造方法都是带有参数的，则必须在子类的构造方法中显示通过super调用父类构造方法，并传入参数
 * 如果父类构造方法为无参，则不是必须使用super关键字，系统会自动调用无参构造方法
 *
 */

class Shape {
    protected String name;

    /**
     * 父类设计一个无参构造方法
     */
    public Shape() {
        name = "Shape";
    }
    public Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle() {
        super("Circle");
        radius = 0;
    }
    public Circle(double radius) {
        // super("Circle");
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
public class SubConstructionMethod {
    public static void main(String[] args) {
        // Circle子类传入参数时，有参构造
        Circle c = new Circle(10);
        System.out.println(c.name);
        System.out.println(c.getRadius());
    }
}
