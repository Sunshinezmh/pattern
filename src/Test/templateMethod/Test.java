package Test.templateMethod;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:47
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass abstractClass=new ConcreteClassA();
        AbstractClass abstractClass1=new ConcreteClassB();
        abstractClass.TemplateMethod();
        abstractClass1.TemplateMethod();
    }
}
