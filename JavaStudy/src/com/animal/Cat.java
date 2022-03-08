package com.animal;

import java.util.Date;
import com.object.MethodOverloading;


public class Cat extends Animal {
    public Cat() {
        name = "Cat";
    }
    public void shout() {
        System.out.println(name + "正在叫");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.shout();
        MethodOverloading m = new MethodOverloading();
        // MethodOverloading类中test方法没有public，不能被别的包调用
        // m.test();
        Date d = new Date();
        System.out.println(d.toString());
    }
}
