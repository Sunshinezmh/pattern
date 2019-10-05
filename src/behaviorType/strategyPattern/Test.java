package behaviorType.strategyPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:07
 */
public class Test {
    public static void main(String[] args) {
        Strategy strategy=new ConcreteStrategyA();
        Strategy strategy1=new ConcreteStrategyB();
        Strategy strategy2=new ConcreteStrategyC();

        Context context=new Context();
        context.setStrategy(strategy);
        context.ContextInterface();

        Context context1=new Context();
        context1.setStrategy(strategy1);
        context1.ContextInterface();

        Context context2=new Context();
        context2.setStrategy(strategy2);
        context2.ContextInterface();
    }
}
