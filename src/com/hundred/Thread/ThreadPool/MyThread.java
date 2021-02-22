package com.hundred.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 默认线程池
 */
public class MyThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
