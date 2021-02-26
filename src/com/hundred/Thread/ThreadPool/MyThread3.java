package com.hundred.Thread.ThreadPool;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor构造参数：
 * 核心线程数量，
 * 最大线程数，
 * 空闲线程最大存活时间，
 * 时间单位，
 * 队列，
 * 创建线程工厂，
 * 任务拒绝策略
 */
public class MyThread3 {
    public static void main(String[] args) {
        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,3,20, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //创建线程
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        //关闭线程池对象
        pool.shutdown();
    }
}
