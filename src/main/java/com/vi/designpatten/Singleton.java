package com.vi.designpatten;

public class Singleton {
    private volatile static Singleton instance = null;

    private Singleton() {
        if (null != instance) {
            throw new RuntimeException("禁止反射-Because-单例模式");
        }
    }

    public Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
