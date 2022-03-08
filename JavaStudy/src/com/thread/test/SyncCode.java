package com.thread.test;

public class SyncCode implements Runnable {
    private int ticket = 6;

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            synchronized (this) {
                if (this.ticket > 0) {      //卖票的条件
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，ticket = " + this.ticket--);
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncCode mt = new SyncCode();
        new Thread(mt, "售票员A").start();
        new Thread(mt, "售票员B").start();
        new Thread(mt, "售票员C").start();
    }
}
