package com.hundred.Thread.food;

public class Demo {
    public static void main(String[] args) {
        Food f = new Food();
        Cooker c = new Cooker();
        f.start();
        c.start();
    }
}
