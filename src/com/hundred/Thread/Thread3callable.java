package com.hundred.Thread;

import java.util.concurrent.Callable;

public class Thread3callable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("我喜欢你："+i);
        }
        return "答应";
    }
}
