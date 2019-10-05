package creationType.absFactoryPattern;

/**
 * @Classname ConcreteFactory2
 * @Auther sunshinezhang
 * @Date 2019/9/27 17:07
 */
public class ConcreteFactory2 extends AbsFactory {
    @Override
    public AbsProductA createProductA() {
        AbsProductA productA2=new ProductA2();
        return productA2;
    }

    @Override
    public AbsProductB createProductB() {
        AbsProductB productB2=new ProductB2();
        return productB2;
    }
}
