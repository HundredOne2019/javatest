package com.hundred.Thread.food;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{

    private ArrayBlockingQueue list;

    public Cooker(ArrayBlockingQueue list){
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            try {
                list.put("汉堡包");
                System.out.println("厨师放入一个汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
