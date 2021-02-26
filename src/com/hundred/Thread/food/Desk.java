package com.hundred.Thread.food;

public class Desk {
    //判断桌上有无汉堡包
    //true  表示桌上有一个汉堡包
    //false 表示桌上没有汉堡包
    public static boolean flag = false;
    //生产汉堡包的总数，也是消费汉堡包的总数
    public static int count = 10;
    //锁对象，设置成一个固定常量的锁
    public static final Object lock = new Object();
}
