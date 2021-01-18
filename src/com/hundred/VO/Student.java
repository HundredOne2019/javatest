package com.hundred.VO;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentName;
    private String age;
    private String sex;

    public Student(String studentName, String age, String sex) {
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
