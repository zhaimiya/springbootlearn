package com.vi.designpatten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tes {
    public static void main(String[] args) {
        Proxy p = new Proxy();
        Subject person = new Person();
        Subject proxy = (Subject) p.creact(person);
        proxy.shopping();

//        User user = new User("Mi");
//        User user1 = new User("Ya");
//        User user2 = new User("Xi");
//
//        Msg msg = new Msg();
//        msg.registerObserver(user);
//        msg.registerObserver(user1);
//        msg.registerObserver(user2);
//        msg.setMsg("预祝明天考试通过");
//        msg.removeObserver(user);
//        msg.setMsg("加油");

        Map<String, String> map = new HashMap<String, String>();
        for (Map.Entry<String, String> inst : map.entrySet()) {
            inst.getKey();
            inst.getValue();
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                // do something
            }
        }).start();

        new Thread(() -> System.out.println("java 8")).start();

        List list = new ArrayList();
        list.add("开心开心！");
        list.stream().forEach(inst -> System.out.println(inst));

        int flag = 1;
        switch (flag) {
            case 1:
                System.out.println("及格");
            case 2:
                System.out.println("优秀");
            default:
                System.out.println("遗憾哦");
        }
    }
}
