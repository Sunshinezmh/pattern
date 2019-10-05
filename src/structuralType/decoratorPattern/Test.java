package structuralType.decoratorPattern;

import com.sun.xml.internal.ws.api.Component;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:54
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent c=new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(c);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.Operation();

    }
}
