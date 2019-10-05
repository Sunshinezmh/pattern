package Test.state;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:41
 */
public class Test {
    public static void main(String[] args) {
        State state=new ConstrateState1();

        Context context=new Context();
        context.setState(state);
        context.Request();
        context.Request();
        context.Request();
        context.Request();
    }
}
