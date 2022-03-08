package com.thread.test;

public class SyncMethod implements Runnable {
    private int ticket = 6;

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            this.sale();
        }
    }

    public synchronized void sale() {
        if (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，ticket = " + this.ticket--);
        }
    }

    public static void main(String[] args) {
        SyncMethod mt2 = new SyncMethod();
        new Thread(mt2,"售票员A").start();
        new Thread(mt2,"售票员B").start();
        new Thread(mt2,"售票员C").start();
    }
}

