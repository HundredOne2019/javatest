package com.hundred.Thread.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable{
    private AtomicInteger ai = new AtomicInteger(0);
    private Integer count = 0;

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            count = ai.incrementAndGet();
            System.out.println(count);
        }
    }
}
