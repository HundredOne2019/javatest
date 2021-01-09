package com.hundred.TransformIO;

import java.io.*;

/**
 * 练习1：JDK11之前，可以使用转换流输入输出的时候保证不乱码
 */
public class TransformIO1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\a.txt"),"utf-8");
        int len;
        while((len = isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
