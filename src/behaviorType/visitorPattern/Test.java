package behaviorType.visitorPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 21:00
 */
public class Test {
    public static void main(String[] args) {

        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitor=new ConcreteVisitor1();
        Visitor visitor1=new ConcreteVisitor2();

        objectStructure.Accept(visitor);
        objectStructure.Accept(visitor1);
    }
}
