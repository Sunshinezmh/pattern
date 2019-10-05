package Test.observer;

/**
 * @Classname ConcreteSubject
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:15
 */
public class ConcreteSubject extends Subject {
    @Override
    public void Add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
