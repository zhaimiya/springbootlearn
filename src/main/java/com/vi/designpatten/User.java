package com.vi.designpatten;

public class User implements Observer {

    private String name;
    //构造器
    public User(String name) {
        this.name = name;
    }
    @Override
    public void updateMsg(String msg) {
        System.out.println("["+name+"]: 收到消息【"+msg+"】");
    }
}
