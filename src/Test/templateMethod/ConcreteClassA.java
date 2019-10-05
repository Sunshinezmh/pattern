package Test.templateMethod;

/**
 * @Classname ConcreteClassA
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:46
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void showA() {
        System.out.println("A展示方法A");
    }

    @Override
    public void showB() {
        System.out.println("A展示方法B");
    }

    @Override
    public void primitiveOperation() {
        super.primitiveOperation();
        System.out.println("钩子方法");
    }

    @Override
    public boolean isPrint() {
        return false;
    }
}
