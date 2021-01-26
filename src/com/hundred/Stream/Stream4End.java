package com.hundred.Stream;

import java.util.stream.Stream;

/**
 * 添加一个集合1,2,3,4,5,6,7,8,9,10
 * 用流的方式将集合里的奇数删除，只保留整数
 * 遍历集合2,4,6,8,10
 */
public class Stream4End {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(s -> s%2==0).forEach(s-> System.out.println(s));
    }
}
