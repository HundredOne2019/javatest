package com.hundred.IO.ObjectIO;

import com.hundred.VO.Student;

import java.io.*;

/**
 * 练习2：创建多个javaBean，写入到文件，再读出到内存
 */
public class ObjectIO2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu1 = new Student("whj","25","男");
        Student stu2 = new Student("wml","27","女");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Object o = null;
        while ((o = ois.readObject())!=null){
            System.out.println((Student)o);
        }
        ois.close();
    }
}
