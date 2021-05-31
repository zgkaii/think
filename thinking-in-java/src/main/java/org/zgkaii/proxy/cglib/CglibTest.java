package org.zgkaii.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:46
 * @Description:
 **/
public class CglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new AutoMethodInterceptor());

        UserService userService = (UserService) enhancer.create();

        userService.saveUser();
        System.out.println(userService);
    }
}
