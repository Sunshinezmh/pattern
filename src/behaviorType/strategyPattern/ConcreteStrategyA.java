package behaviorType.strategyPattern;

/**
 * @Classname ConcreteStrategyA
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:04
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A的实现");
    }
}
