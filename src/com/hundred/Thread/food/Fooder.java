package com.hundred.Thread.food;

import java.util.concurrent.ArrayBlockingQueue;

public class Fooder extends Thread{

    private ArrayBlockingQueue list;

    public Fooder(ArrayBlockingQueue list){
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            try {
                Object take = list.take();
                System.out.println("吃货吃掉一个："+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
