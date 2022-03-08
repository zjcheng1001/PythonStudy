package com.abstractclass;

/**
 * public abstract class 类名 {   // 定义一个抽象类
 *     // 抽象方法没有方法体，用abstract修饰
 *     public abstract void 方法名 {};
 * }
 */
public class Abstract {
    public static void main(String[] args) {
        show(new Robot());
        show(new Human());
    }
    public static void show(Action act) {
        // show方法执行Action的command
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);
    }
}
