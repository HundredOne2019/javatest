package com.hundred.IO.CharIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 练习1：输入用户名和密码实现永久录入
 */
public class CharIO2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        FileWriter fw = new FileWriter("aaa\\test.txt");
        fw.write(username);
        fw.write("\r\n");
        fw.write(password);
        fw.close();
    }
}
