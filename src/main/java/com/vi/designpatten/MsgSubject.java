package com.vi.designpatten;

public interface MsgSubject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
