package structuralType.decoratorPattern;

/**
 * @Classname ConcreteDecoratorA
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:49
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("具体装饰对象B的操作"+showB());
    }

    public String showB(){
        return "我最美";
    }


}
