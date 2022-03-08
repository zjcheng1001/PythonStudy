package com.thread.test;

public class JoinTest implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我是：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinTest j = new JoinTest();
        Thread t = new Thread(j);
        t.setName("子线程");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("我是主线程");
            if (i == 5) {
                try {
                    //合并子线程
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
