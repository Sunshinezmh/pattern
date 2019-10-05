package structuralType.bridgePattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:41
 */
public class Test {
    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.Operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.Operation();
    }

}
