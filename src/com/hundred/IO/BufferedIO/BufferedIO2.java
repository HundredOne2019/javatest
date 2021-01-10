package com.hundred.IO.BufferedIO;

import java.io.*;

/**
 * 练习：字节缓冲流以数组的方式完成拷贝
 */
public class BufferedIO2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\iii.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
        byte[] b = new byte[1024];
        int len = 0;
        while((len=bis.read(b)) != -1){
            bos.write(b,0,len);
        }
        bis.close();
        bos.close();
    }
}
