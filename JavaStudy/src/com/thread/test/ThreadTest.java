package com.thread.test;

class ThreadTest extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TestThread 正在运行");
        }
    }
}

class ThreadTest2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TestThread2 正在运行");
        }
    }
}

class Test {
    public static void main(String[] args) {
        new ThreadTest().start();

        ThreadTest2 t = new ThreadTest2();
        new Thread(t).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在运行");
        }
    }
}
