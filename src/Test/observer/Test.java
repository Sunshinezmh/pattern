package Test.observer;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:15
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.Add(observer);
        subject.Notify();
    }
}
