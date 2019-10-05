package Test.observer;

/**
 * @Classname ConcreteObserver
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:13
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("更新状态");
    }
}
