package org.zgkaii.java8;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/29 10:36
 * @Description:
 **/
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("do nothing");
                }
            }
        }).start();
    }
}
