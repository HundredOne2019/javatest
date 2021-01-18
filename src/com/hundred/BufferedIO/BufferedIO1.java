package com.hundred.BufferedIO;

import java.io.*;

public class BufferedIO1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\iii.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));
        int b = 0;
        while((b = bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
