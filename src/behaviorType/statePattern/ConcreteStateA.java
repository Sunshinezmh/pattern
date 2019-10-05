package behaviorType.statePattern;

/**
 * @Classname ConcreteStateA
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:11
 */
public class ConcreteStateA implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
        System.out.println("吃饭");
    }
}
