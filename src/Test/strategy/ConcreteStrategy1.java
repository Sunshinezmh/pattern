package Test.strategy;

/**
 * @Classname ConcreteStrategy1
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:20
 */
public class ConcreteStrategy1 extends Strategy {
    @Override
    public void Request() {
        System.out.println("策略一");
    }
}
