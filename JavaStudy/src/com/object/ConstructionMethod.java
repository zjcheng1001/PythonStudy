package com.object;

/**
 * 构造方法的名称必须与类的名称完全相同。
 * 构造方法不返回任何数据，也不需要使用void关键字声明。
 * 构造方法的作用是创建对象并初始化成员变量。
 * 在创建对象时，系统会自动调用类的构造方法。
 * 构造方法一般用public关键字声明。
 * 每个类至少有一个构造方法。如果不定义构造方法，Java将提供一个默认的不带参数且方法体为空的构造方法
 * 构造方法也可以重载
 */
class Person {
    String name;
    int age;
    public Person(String name, int age) { // 定义构造方法，有两个参数
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("我叫" + name + "，今年" + age + "岁。");
    }
}

public class ConstructionMethod {
    public static void main(String[] args) {
        // 实例化一个对象p，构造方法传入参数name和age
        Person p = new Person("张三", 18);
        p.speak();

        // 修改对象p的属性，再调用方法
        p.name = "李四";
        p.age = 20;
        p.speak();

        // 实例化另一个对象p2
        Person p2 = new Person("王五", 23);
        p2.speak();
    }
}
