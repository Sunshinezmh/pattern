package structuralType.decoratorPattern;

/**
 * @Classname ConcreteDecoratorA
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:49
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        this.addedState = "new addedState";
        System.out.println("具体装饰对象A的操作"+this.addedState);
    }


}
