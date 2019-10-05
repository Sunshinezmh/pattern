package behaviorType.commandPattern;

/**
 * @Classname Receiver
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:16
 */
public class Receiver1 extends AbsReceiver{

    @Override
    public void Action() {
        System.out.println("执行请求1");
    }
}
