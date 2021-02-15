package com.hundred.Thread;

public class Demo5 {
    public static void main(String[] args) {
        Thread5Ticket mr = new Thread5Ticket();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t1.start();
        t2.start();
    }
}
