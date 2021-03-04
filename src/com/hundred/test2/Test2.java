package com.hundred.test2;

import com.hundred.test1.Test1;

public class Test2 extends Test1 {

    public String get(String str){
        return "1";
    }
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.get("1"));
    }
}
