package org.zgkaii.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:45
 * @Description:
 **/
public class AutoMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before-------切面加入逻辑");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("after-------切面加入逻辑");
        return object;
    }
}
