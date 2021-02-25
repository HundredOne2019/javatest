package com.hundred.Thread.AtomicInteger;

public class demo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        for (int i = 0; i < 100; i++) {
            new Thread(thread1).start();
        }
    }
}
