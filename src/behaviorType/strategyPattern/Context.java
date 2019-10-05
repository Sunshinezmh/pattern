package behaviorType.strategyPattern;

/**
 * @Classname Context
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:06
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
