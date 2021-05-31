package org.zgkaii.java8;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/28 10:54
 * @Description:
 **/
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
