package com.hundred.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO4 {
    public static void main(String[] args) throws IOException {
        //1.输入流如果找不到对应的文件会自动报错
        FileInputStream fis = new FileInputStream("aaa\\aaa.txt");
        //2.定义一个变量来存储输入数据
        int b = 0;
        //3.输入数据如果为空，字节数为-1，所有判断为-1的就终止循环，停止输入
        //read方法执行一次就读一个字节
        while((b = fis.read())!=-1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
