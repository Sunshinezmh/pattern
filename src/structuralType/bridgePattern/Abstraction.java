package structuralType.bridgePattern;

/**
 * @Classname Abstraction
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:30
 */
public  class Abstraction {
    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation(){
        implementor.OperationImpl();
    };
}
