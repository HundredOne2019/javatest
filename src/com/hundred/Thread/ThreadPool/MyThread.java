package com.hundred.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 默认线程池
 */
public class MyThread {
    public static void main(String[] args) {
        //新建默认线程池newCachedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();
        //创建线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        //关闭线程池
        executorService.shutdown();
    }
}
