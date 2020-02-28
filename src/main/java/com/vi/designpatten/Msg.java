package com.vi.designpatten;

import java.util.ArrayList;
import java.util.List;

public class Msg implements MsgSubject {
    private List<Observer> observers = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.updateMsg(msg);
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }
}
