package com.hundred.IO.ObjectIO;

import com.hundred.VO.User;

import java.io.*;

public class ObjectIO1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //objectOutput();

        objectInput();
    }

    private static void objectInput() throws IOException, ClassNotFoundException {
        //1.创建一个对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //2.读到一个User对象流
        User o = (User) ois.readObject();
        //3.打印对象
        System.out.println(o);
        //4.关闭流
        ois.close();
    }

    private static void objectOutput() throws IOException {
        //1.拿到一个对象
        User user = new User("whj","123456");
        //2.创建一个对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        //3.将对象写入到问件，注意是调用writeObject方法
        oos.writeObject(user);
        //4.关闭流
        oos.close();
    }
}
