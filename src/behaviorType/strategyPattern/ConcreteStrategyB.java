package behaviorType.strategyPattern;

/**
 * @Classname ConcreteStrategyB
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:05
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B的实现");
    }
}
