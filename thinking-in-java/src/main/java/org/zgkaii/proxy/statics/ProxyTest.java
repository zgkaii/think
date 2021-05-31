package org.zgkaii.proxy.statics;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:30
 * @Description:
 **/
public class ProxyTest {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserProxy userProxy = new UserProxy(userDao);
        userProxy.proxy();
    }
}
