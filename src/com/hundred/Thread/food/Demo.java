package com.hundred.Thread.food;


import java.util.concurrent.ArrayBlockingQueue;

/**
 * 阻塞队列等待唤醒机制
 */
public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue list = new ArrayBlockingQueue(1);
        Fooder f = new Fooder(list);
        Cooker c = new Cooker(list);
        f.start();
        c.start();
    }
}
