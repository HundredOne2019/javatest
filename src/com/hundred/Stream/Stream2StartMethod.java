package com.hundred.Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Stream2StartMethod {
    public static void main(String[] args) {
        //method1();

        //method2();

        //method3();

        //method4();

    }

    private static void method4() {
        //同种数据类型的数据
        Stream.of("1","2","3","4","5").forEach(s-> System.out.println(s));
    }

    private static void method3() {
        //数组
        int[] in = {1,2,3,6,5,4,};
        Arrays.stream(in).forEach(s-> System.out.println(s));
    }

    private static void method2() {
        //双列集合
        HashMap<String,String> map = new HashMap<>();
        map.put("whj","16");
        map.put("wml","16");
        map.put("zwj","16");
        map.put("xln","16");
        map.keySet().stream().forEach(s -> System.out.println(s));
        map.entrySet().stream().forEach(s-> System.out.println(s.getKey()+":"+s.getValue()));
    }

    private static void method1() {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("whj");
        list.add("wml");
        list.add("zwj");
        list.add("xln");
        list.stream().forEach(s -> System.out.println(s));
    }
}
