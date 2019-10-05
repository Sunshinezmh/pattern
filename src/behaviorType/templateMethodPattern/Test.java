package behaviorType.templateMethodPattern;

/**
 *
 * 　使用场景：
 *
 * 　　　　1、在多个子类中拥有相同的方法，而且逻辑相同时，可以将这些方法抽出来放到一个模板抽象类中。
 *
 * 　　　　2、程序主框架相同，细节不同的情况下，也可以使用模板方法。
 *
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 14:43
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass a=new ConcreteClassA();
        a.TemplateMethod();

        AbstractClass b=new ConcreteClassB();
        b.TemplateMethod();
    }
}
