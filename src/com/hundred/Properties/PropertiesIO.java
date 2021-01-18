package com.hundred.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties读取，写入练习
 */
public class PropertiesIO {
    public static void main(String[] args) throws IOException {
        //写入
        Properties prop = new Properties();
        prop.put("whj","1234");
        prop.put("wml","1234");
        FileWriter fw = new FileWriter("prop.properties");
        prop.store(fw,"abc");
        fw.close();

        //读取
        Properties prop1 = new Properties();
        FileReader fr = new FileReader("prop.properties");
        prop1.load(fr);
        fr.close();
        System.out.println(prop1);
    }
}
