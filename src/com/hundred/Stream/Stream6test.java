package com.hundred.Stream;

import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class Stream6test {
    public static void main(String[] args) {
        ArrayList<String> man = new ArrayList<>();
        man.add("张1");
        man.add("王11");
        man.add("张21");
        man.add("张31");
        man.add("张4");
        ArrayList<String> woman = new ArrayList<>();
        woman.add("杨1");
        woman.add("杨2");
        woman.add("杨3");
        woman.add("王1");
        woman.add("杨4");
        woman.add("杨5");

        Stream<String> stream1 = man.stream().filter(s -> {
            int length = s.toCharArray().length;
            return length > 2;
        }).limit(2);
        Stream<String> stream2 = woman.stream().filter(s -> {
            char c = s.toCharArray()[0];
            return "杨".equals(String.valueOf(c));
        }).skip(1);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(s -> {
            Student stu = new Student(s);
            System.out.println(stu);
        });
    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}