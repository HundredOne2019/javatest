package com.hundred.IO.CharIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class CharIO4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("aaa\\b.txt");
        fis.close();
    }
}
