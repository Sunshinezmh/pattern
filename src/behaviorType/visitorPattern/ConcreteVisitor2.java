package behaviorType.visitorPattern;

/**
 * @Classname ConcreteVisitor2
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:50
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("访问者:"+this.getClass().getSimpleName()+"-----"+"被访问对象:"+concreteElementA.getClass().getSimpleName());

    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("访问者:"+this.getClass().getSimpleName()+"-----"+"被访问对象:"+concreteElementB.getClass().getSimpleName());
    }
}
