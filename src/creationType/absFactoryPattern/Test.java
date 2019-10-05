package creationType.absFactoryPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/27 17:21
 */
public class Test {
    public static void main(String[] args) {
        AbsFactory absFactory=new ConcreteFactory1();
        AbsProductA absProductA=absFactory.createProductA();
        AbsProductB absProductB=absFactory.createProductB();
        absProductA.showA();
        absProductB.showB();


        AbsFactory absFactory2=new ConcreteFactory2();
        AbsProductA absProductA1=absFactory2.createProductA();
        AbsProductB absProductB1=absFactory2.createProductB();
        absProductA1.showA();
        absProductB1.showB();
    }
}

