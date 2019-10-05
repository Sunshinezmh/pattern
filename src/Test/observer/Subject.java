package Test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subject
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:13
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public abstract void Add(Observer observer);
    public abstract void Remove(Observer observer);
    public abstract void Notify();
}
