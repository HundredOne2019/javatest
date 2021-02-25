package com.hundred.Thread;

public class Thread1thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程执行了："+i+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread1thread t1 = new Thread1thread();
        t1.start();
        Thread1thread t2 = new Thread1thread();
        t2.start();
    }

}
