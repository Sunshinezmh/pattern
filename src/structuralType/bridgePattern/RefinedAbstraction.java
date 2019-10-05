package structuralType.bridgePattern;

/**
 * @Classname RefinedAbstraction
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:31
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void Operation() {
        implementor.OperationImpl();
    }
}
