package com.object;

public class MethodOverloading {
    // 一个不带参数的普通方法
    void test() {
        System.out.println("No Parameters");
    }
    // 重载上面的方法，并带一个整型参数
    void test(int a) {
        System.out.println("a: " + a);
    }
    // 重载上面的方法，并带两个整型参数
    void test(int a, int b) {
        System.out.println("a: " + a + "b: " + b);
    }
    // 重载上面的方法，并带一个双精度参数
    void test(double a) {
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.test();
        m.test(1);
        m.test(1, 2);
        m.test(1.0);
    }
}
