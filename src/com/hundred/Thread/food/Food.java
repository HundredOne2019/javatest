package com.hundred.Thread.food;

public class Food extends Thread{
    /**
     * 1.吃货被唤醒去桌上吃汉堡包
     * 2.如果桌上没有汉堡包，则等待
     * 3.如果桌上有汉堡包，被唤醒
     * 4.减少一个汉堡包
     */
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(Desk.flag){
                        //如果有汉堡包，唤醒，吃一个
                        Desk.lock.notifyAll();
                        System.out.println("吃货吃了一个汉堡包，汉堡包总数还剩："+Desk.count);
                        Desk.count--;
                        Desk.flag = false;
                    }else{
                        //如果没有汉堡包，等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
