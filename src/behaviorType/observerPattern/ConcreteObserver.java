package behaviorType.observerPattern;

import java.io.Console;

/**
 * 具体的观察者
 * @Classname ConcreteObserver
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:52
 */
public class ConcreteObserver extends Observer {

    @Override
    public void Update() {
        System.out.println("更新自己的状态");
    }

}
