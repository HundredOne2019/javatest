package com.hundred.CharIO;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 练习3：读取本地文件，排序后写到指定文件
 */
public class CharIO3 {
    public static void main(String[] args) throws IOException {
        //1.把文件的数据读入到程序
        FileReader fileReader = new FileReader("aaa\\a.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String str = br.readLine();
        br.close();
        //2.处理数据并排序
        String[] s = str.split(" ");
        int [] in = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            in[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(in);
        System.out.println(Arrays.toString(in));
        FileWriter fw = new FileWriter("aaa\\b.txt");
        for (int i = 0; i < in.length; i++) {
            fw.write(in[i]+" ");
            fw.flush();
        }
        fw.close();
    }
}
