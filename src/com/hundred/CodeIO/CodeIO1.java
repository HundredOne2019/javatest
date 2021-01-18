package com.hundred.CodeIO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodeIO1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String s = "五阅";
        //默认utf-8编码
        byte[] b = s.getBytes();
        System.out.println(Arrays.toString(b));
        byte[] b1 = s.getBytes("GBK");
        System.out.println(Arrays.toString(b1));

        //解码
        String str1 = new String(b);
        System.out.println(str1);
        String str2 = new String(b1,"GBK");
        System.out.println(str2);
    }
}
