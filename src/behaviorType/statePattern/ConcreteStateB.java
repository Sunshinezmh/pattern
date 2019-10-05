package behaviorType.statePattern;

/**
 * @Classname ConcreteStateB
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:12
 */
public class ConcreteStateB implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateC());
        System.out.println("睡觉");
    }
}
