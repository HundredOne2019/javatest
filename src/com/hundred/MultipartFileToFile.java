package com.hundred;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MultipartFileToFile {

    public static void main(String[] args) {

    }

//    public static File multipartFileToFile(MultipartFile file) throws Exception {
//        File toFile = null;
//        if (file.equals("") || file.getSize() <= 0) {
//            file = null;
//        } else {
//            InputStream ins = null;
//            ins = file.getInputStream();
//            toFile = new File(file.getOriginalFilename());
//            inputStreamToFile(ins, toFile);
//            ins.close();
//        }
//        return toFile;
//    }

    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
