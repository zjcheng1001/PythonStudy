package com.abstractclass;

public class Robot extends Action { // 定义一个类继承抽象类Action
    // 实现抽象方法
    public void eat() {
        System.out.println("机器人充电");
    }
    public void sleep() {
        System.out.println("机器人关机");
    }
    public void work() {
        System.out.println("机器人工作");
    }
}
