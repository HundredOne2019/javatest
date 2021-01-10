package com.hundred.IO.FileIO;

import java.io.File;
import java.io.IOException;

/**
 * 练习1：如何建一个目录包含一个文件
 */
public class FileIO1 {
    public static void main(String[] args) throws IOException {
//        oldMethod1();
//        oldMethod2();
    }

    private static void oldMethod2() throws IOException {
        File file = new File("javatest\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file1 = new File(file, "aaa.txt");
        if (!file1.exists()) {
            boolean b = file1.createNewFile();
            System.out.println(b);
        }
    }

    private static void oldMethod1() {
        File file = new File("aaa");
        file.mkdirs();
        System.out.println(file);
        if (file.exists()) {
            File txt = new File(file, "aaa.txt");
            try {
                boolean newFile = txt.createNewFile();
                System.out.println(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
