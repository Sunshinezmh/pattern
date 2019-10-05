
package Test.absFactory;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:34
 */
public class Test {
    public static void main(String[] args) {
        Factory factory1=new Factory1();
        Factory factory2=new Factory2();

        ProductA productA=factory1.createProductA();
        ProductB productB=factory1.createProductB();

        productA.showA();
        productB.showB();


        ProductA productA1=factory2.createProductA();
        ProductB productB1=factory2.createProductB();

        productA1.showA();
        productB1.showB();
    }
}
