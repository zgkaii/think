package org.zgkaii.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:29
 * @Description:
 **/
public class UserHandler implements InvocationHandler {
    /**
     * 这个就是我们要代理的真实对象
     */
    private UserDao userDao;

    public UserHandler(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        saveStart();

        System.out.println("Method:" + method);

        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object obj = method.invoke(userDao, args);

        saveEnd();
        return obj;
    }

    private void saveStart() {
        System.out.println("------插入开始------");
    }

    private void saveEnd() {
        System.out.println("------插入结束------");
    }
}
