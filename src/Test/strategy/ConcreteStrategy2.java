package Test.strategy;

/**
 * @Classname ConcreteStrategy2
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:20
 */
public class ConcreteStrategy2 extends Strategy {
    @Override
    public void Request() {
        System.out.println("策略二");
    }
}
