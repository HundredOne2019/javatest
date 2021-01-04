package com.hundred.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 练习4(字节数组)：复制文件到工作目录下
 */
public class FileIO6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\iii.txt");
        FileOutputStream fos = new FileOutputStream("iii.txt");
        byte [] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
