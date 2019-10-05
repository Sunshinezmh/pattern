package behaviorType.visitorPattern;

/**
 * 具体的对象
 * @Classname ConcreteElementA
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:46
 */
public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
        OperatorA();
    }

    public void OperatorA() {
        System.out.println("A特有的方法OperatorA");
    }

}
