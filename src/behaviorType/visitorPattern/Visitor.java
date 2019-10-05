package behaviorType.visitorPattern;

/**
 * 抽象的访问者
 *
 * @Classname Visitor
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:45
 */
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
