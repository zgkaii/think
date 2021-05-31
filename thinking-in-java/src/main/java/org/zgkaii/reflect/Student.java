package org.zgkaii.reflect;

import java.util.Date;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/26 21:22
 * @Description: 待反射类
 **/
public class Student {
    public String name;
    public int age;
    /**
     * 生日只有自己知道
     */
    public Date birthday;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}

