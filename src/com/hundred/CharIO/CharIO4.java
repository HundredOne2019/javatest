package com.hundred.CharIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharIO4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("aaa\\b.txt");
        fis.close();
    }
}
