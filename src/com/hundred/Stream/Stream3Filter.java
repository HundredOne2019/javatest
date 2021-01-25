package com.hundred.Stream;

import java.util.ArrayList;

public class Stream3Filter {
    public static void main(String[] args) {
        /**
         * filter是最常用的中间方法
         * Stream <T> filter(Predicate predicate)
         * Predicate 有个唯一的抽象方法 boolean test(T t)
        */
        ArrayList<String> list = new ArrayList<>();
        list.add("whj");
        list.add("wml");
        list.add("zwj");
        list.add("xln");
        list.stream().filter(s->s.contains("w")).forEach(s -> System.out.println(s));
    }
}
