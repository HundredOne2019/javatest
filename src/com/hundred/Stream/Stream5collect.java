package com.hundred.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream5collect {
    public static void main(String[] args) {
        //method1();
        ArrayList<String> list = new ArrayList();
        list.add("whj,13");
        list.add("wml,14");
        list.add("xy,15");
        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 13)
                //调用toMap方法，键取逗号前一串字符，值取逗号后一串字符串
                .collect(Collectors.toMap(s -> s.split(",")[0]
                        , s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);
    }

    private static void method1() {
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
