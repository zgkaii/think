package org.zgkaii.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/26 21:32
 * @Description: 测试
 **/
public class StudentTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 获取Class对象
        Class<?> class01 = Class.forName("org.zgkaii.reflect.Student");
        Class class02 = Student.class;

        Student student = new Student();
        Class<? extends Student> class03 = student.getClass();

        assert class01 == class02;
        assert class01 == class03;
        assert class02 == class03;

        // 构造类的实例化对象
        Class<?> class04 = Class.forName("org.zgkaii.reflect.Student");
        Student student01 = (Student) class04.newInstance();
        student01.getInfo();

        Class<?> class05 = Class.forName("org.zgkaii.reflect.Student");
        Constructor<?> constructor = class05.getConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Student student02 = (Student) constructor.newInstance("李四", 22);
        student02.getInfo();

    }
}
