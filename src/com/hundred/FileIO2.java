package com.hundred;

import java.io.File;

/**
 * 如何删除一个多级文件夹
 */
public class FileIO2 {
    public static void main(String[] args) {
        //oldMethod1();
        File file = new File("javatest");
        oldMethod2(file);
    }

    private static void oldMethod2(File file) {
        File[] files = file.listFiles();
        for(File file1:files){
            if(file1.isFile()){
                file1.delete();
            }else{
                oldMethod2(file1);
            }
        }
        file.delete();
    }

    private static void oldMethod1() {
        File file = new File("javatest\\aaa");
        String[] strings = file.list();
        for (String string : strings) {
            File file1 = new File(file, string);
            boolean b = file1.delete();
            System.out.println(b);
        }
        if(file.exists()){
            boolean b = file.delete();
            System.out.println(b);
        }
    }
}
