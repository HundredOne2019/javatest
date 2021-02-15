package com.hundred.Thread;

public class Thread4Ticket implements Runnable{
    private Integer ticket = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){//传入一个锁对象，将操作同步数据用锁锁起来
                if(ticket == 0){
                    break;
                }else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"卖掉一张票，还剩"+ticket+"张票");
                }
            }
        }
    }
}
