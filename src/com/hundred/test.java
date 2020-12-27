package com.hundred;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test {
    public static void main(String[] args) {
        File file = new File("aaa");
        boolean b = file.isFile();
        File file2 = new File(file,"aaa.doc");
        boolean b2 = file2.isFile();
        System.out.println(b+","+b2);
    }
}
