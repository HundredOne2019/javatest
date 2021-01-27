package com.hundred.Thread;

public class Thread2runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程执行了："+i);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        Thread2runnable r1 = new Thread2runnable();
        Thread2runnable r2 = new Thread2runnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}