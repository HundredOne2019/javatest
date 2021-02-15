package com.hundred.Thread;

public class Thread5Ticket implements Runnable{
    private Integer ticket = 100;
    @Override
    public void run() {
        while(true){
            if ("窗口一".equals(Thread.currentThread().getName())){
                //同步方法
                boolean b = synchronizedMethod();
                if(!b){
                    break;
                }
            }
            if ("窗口二".equals(Thread.currentThread().getName())){
                synchronized (this){
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

    private synchronized boolean synchronizedMethod() {
        if(ticket == 0){
            return false;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName()+"卖掉一张票，还剩"+ticket+"张票");
            return true;
        }
    }
}
