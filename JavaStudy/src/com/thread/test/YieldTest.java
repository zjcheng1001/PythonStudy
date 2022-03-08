package com.thread.test;

public class YieldTest implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i % 3 == 0) {
                Thread.yield();     // 线程让出CPU资源
            }
        }
    }

    public static void main(String[] args) {
        YieldTest y = new YieldTest();
        Thread t1 = new Thread(y);
        Thread t2 = new Thread(y);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
