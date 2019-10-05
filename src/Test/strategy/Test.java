package Test.strategy;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:22
 */
public class Test {
    public static void main(String[] args) {
        Strategy strategy=new ConcreteStrategy1();
        Strategy strategy1=new ConcreteStrategy2();
        Strategy strategy2=new ConcreteStrategy3();

        Context context = new Context();
        context.setStrategies("st1",strategy);
        context.setStrategies("st2",strategy1);
        context.setStrategies("st3",strategy2);
        context.handler("st3");
    }
}
