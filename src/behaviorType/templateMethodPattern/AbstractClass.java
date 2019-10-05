package behaviorType.templateMethodPattern;

/**
 * @Classname AbstractClass
 * @Auther sunshinezhang
 * @Date 2019/10/1 14:38
 */
public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("抽象类模板方法 ");
    }
}
