package behaviorType.statePattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:14
 */
public class Test {
    public static void main(String[] args) {

        Context context = new Context(new ConcreteStateA());
        context.Request();
        context.Request();
        context.Request();
        context.Request();

    }
}
