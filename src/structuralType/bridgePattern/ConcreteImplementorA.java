package structuralType.bridgePattern;

/**
 * @Classname ConcreteImplementorA
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:33
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("红色");
    }
}
