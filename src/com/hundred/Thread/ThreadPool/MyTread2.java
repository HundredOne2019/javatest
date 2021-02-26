package com.hundred.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 最大线程池设定
 */
public class MyTread2 {
    public static void main(String[] args) {
        //新建最大线程池newFixedThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //新建线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
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
