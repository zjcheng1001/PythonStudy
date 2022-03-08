package com.interfacestudy;

/**
 * 接口是比抽象类更高的抽象，它是一个完全抽象的类，即抽象方法的集合
 * 使用interface关键字，语法如下：
 * public interface 接口名称 [extends 其他的类名] {
 *      [public] [static] [final] 数据类型 成员名称=常量值;
 *          [public] [static] [abstract] 返回值 抽象方法名(参数列表);
 * }
 */
public interface Shape {
    // 定义两个抽象方法
    public double area();       // 计算面积
    public double perimeter();  // 计算周长
}
