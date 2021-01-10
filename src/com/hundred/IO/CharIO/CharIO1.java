package com.hundred.IO.CharIO;

import java.io.FileWriter;
import java.io.IOException;

public class CharIO1 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("aaa\\a.txt");
        fw.write("97");
        fw.close();
    }
}
