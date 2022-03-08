package com.factory.model;

import java.util.ArrayList;
import java.util.List;

/**
 * package factory.method的结构为：
 *  定义了一个Fruit接口，并实现了接口方法eat()
 *  然后定义了Apple类和Orange类，实现了接口的接口方法eat()
 *  之后定义了Factory类，并实现getInterface方法，该方法参数列表为一个字符串，根据输入的字符串，实例化不同的子类
 */
public class Factory {
    // Fruit为getInterface方法需要返回的类型
    public static Fruit getInterface(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        }
        if ("orange".equals(className)) {
            return new Orange();
        }
        return null;
    }
    public static void main(String[] args) {
        Fruit f = Factory.getInterface(args[0]);
        f.eat();
    }
}
