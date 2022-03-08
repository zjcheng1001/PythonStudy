/**
 * 继承：
 * class 子类名 extends 父类名
 */
package com.object;

/**
 * 父类: Animal
 */
class Animal {
    public String name;
    private int id;
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡");
    }
}

/**
 * 子类: Cat
 */
class Cat extends Animal {
    public void shout() {
        System.out.println(name + "正在叫");
    }
    public void eat() {
        System.out.println("子类");
        // 子类继承父类成员方法，同名则覆盖。如果要访问父类的同名成员方法，使用super关键字来引用
        super.eat();
    }
}

public class SubClass {
    public static void main(String[] args) {
        Cat c = new Cat();
        // 子类继承了父类的public成员变量，不能继承private成员变量
        c.name = "小猫";
        c.eat();
        c.shout();
    }
}
