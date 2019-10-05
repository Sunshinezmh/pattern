package behaviorType.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subject
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:51
 */
public abstract class Subject {
    protected List<Observer> observersList = new ArrayList<>();

    public abstract void Attach(Observer observer);

    public abstract void Detach(Observer observer) ;

    public abstract void Notify();
}
