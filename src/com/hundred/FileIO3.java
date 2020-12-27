package com.hundred;

import java.io.File;

public class FileIO3 {
    public static void main(String[] args) {
        File file = new File("aaa");
        method1(file);
    }

    private static void method1(File file) {
        String[] list = file.list();
        for (String str : list) {
            String[] split = str.split("\\.");
            String s = split[split.length - 1];

        }
    }
}
