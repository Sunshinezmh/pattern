package behaviorType.statePattern;

/**
 * @Classname ConcreteStateC
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:12
 */
public class ConcreteStateC implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
        System.out.println("喝水");
    }
}
