package com.thread.test;

import java.util.Date;

public class SleepTest implements Runnable{
    boolean flag = true;
    public void run() {
        System.out.println("子线程执行");
        while (flag) {
            System.out.println("---" + new Date() + "---");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("中断子线程，跳出while循环");
                break;
            }
        }
    }

    public static void main(String[] args) {
        SleepTest s = new SleepTest();
        //创建子线程
        Thread t = new Thread(s);
        System.out.println("主线程执行");
        System.out.println("主线程睡眠5s");
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程执行");
        t.interrupt();
    }
}
