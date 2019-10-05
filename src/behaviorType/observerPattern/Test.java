package behaviorType.observerPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:02
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.Attach(observer);
        subject.Notify();
    }
}
