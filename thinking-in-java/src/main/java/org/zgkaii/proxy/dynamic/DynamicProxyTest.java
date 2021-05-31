package org.zgkaii.proxy.dynamic;

import org.zgkaii.proxy.statics.UserProxy;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:30
 * @Description:
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        // 要代理的真实对象
        UserDao userDao = new UserDaoImpl();
        // 要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        UserHandler handler = new UserHandler(userDao);

        ClassLoader classLoader = handler.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数classLoader，这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数interfaces，为代理对象提供的接口是真实对象所实行的接口，表示代理的是该真实对象，这样就能调用这组接口中的方法
         * 第三个参数handler，这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        UserDao proxy = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, handler);

        System.out.println(proxy.getClass().getName());
        proxy.save();
    }
}
