package com.hundred;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 练习4：复制文件到工作目录下
 */
public class FileIO5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\iii.txt");
        FileOutputStream fos = new FileOutputStream("iii.txt");
        int b;
        while((b = fis.read())!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
