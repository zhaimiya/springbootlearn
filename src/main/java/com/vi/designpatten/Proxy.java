package com.vi.designpatten;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 用于动态生成代理对象
public class Proxy  implements InvocationHandler {

    private Object targect; //被代理对象

    /**
     *用于创建代理对象
     * @param o 被代理对象
     * @return
     */
    public  Object creact(Object o){
        this.targect = o;
        // 创建代理对象的实例
        /**
         * 参数1：类加载器
         * 参数2：接口
         * 参数3：创建代理类的对象（当前类Proxy）
         */
       return  java.lang.reflect.Proxy.newProxyInstance(targect.getClass().getClassLoader(),
                targect.getClass().getInterfaces(),this);
    }

    /**
     * 代理对象要执行的方法
     * @param proxy 代理类对象
     * @param method 被代理对象的方法
     * @param args  被代理对象方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代购已找到商品");
        System.out.println("");
        method.invoke(targect,args);
        System.out.println("交易结束");
        return null;
    }
}
