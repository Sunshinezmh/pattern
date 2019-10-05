package behaviorType.visitorPattern;

/**
 * 具体的对象
 * @Classname ConcreteElementB
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:48
 */
public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
        OperatorB();
    }

    public void OperatorB(){
        System.out.println("B特有的方法OperatorB");
    }
}
