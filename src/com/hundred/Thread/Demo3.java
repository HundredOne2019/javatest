package com.hundred.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建继承Callable接口的类
        Thread3callable tc1 = new Thread3callable();
        Thread3callable tc2 = new Thread3callable();

        FutureTask<String> ft1 = new FutureTask<>(tc1);
        FutureTask<String> ft2 = new FutureTask<>(tc2);
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        t1.start();
        t2.start();
        String s = ft1.get();
        System.out.println(s);
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
