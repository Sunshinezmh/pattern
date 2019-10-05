package Test.state;

/**
 * @Classname ConstrateState1
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:38
 */
public class ConstrateState1 extends State {
    @Override
    public void showState(Context context) {
        context.setState(new ConstrateState2());
        System.out.println("吃饭了");


    }
}
