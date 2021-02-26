package com.hundred.Thread.food;

public class Cooker extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(!Desk.flag){
                        //如果没有汉堡包，唤醒，做一个
                        Desk.lock.notifyAll();
                        System.out.println("厨师做了一个汉堡包，汉堡包总数还剩："+Desk.count);
                        Desk.flag = true;
                    }else{
                        //如果有汉堡包，等待
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
