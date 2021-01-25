package com.hundred.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * "王汉杰","王浩杰","王向红","李海林","王梦琳"
 */
public class Stream1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("王汉杰","王浩杰","王向红","李海林","王梦琳"));
        list1.stream()
                .filter(l -> l.startsWith("王"))
                .filter(l -> l.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
