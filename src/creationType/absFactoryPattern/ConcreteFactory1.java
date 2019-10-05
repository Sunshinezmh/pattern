package creationType.absFactoryPattern;

/**
 * @Classname ConcreteFactory1
 * @Auther sunshinezhang
 * @Date 2019/9/27 17:06
 */
public class ConcreteFactory1 extends AbsFactory {
    @Override
    public AbsProductA createProductA() {
        AbsProductA productA1=new ProductA1();
        return productA1;
    }

    @Override
    public AbsProductB createProductB() {
        AbsProductB productB1 = new ProductB1();
        return productB1;
    }
}
