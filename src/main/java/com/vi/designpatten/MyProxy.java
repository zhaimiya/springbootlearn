package com.vi.designpatten;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {


    private Object target;

    //获取代理类
    public Object createTarget(Object o) {
        this.target = o;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理方法
       method.invoke(target,method);
        return null;
    }
}
