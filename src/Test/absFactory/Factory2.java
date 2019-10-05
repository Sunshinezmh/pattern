package Test.absFactory;

/**
 * @Classname Factory2
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:35
 */
public class Factory2 extends Factory {


    @Override
    public ProductA createProductA() {
        ProductA productA=new ProductA2();
        return productA;
    }

    @Override
    public ProductB createProductB() {
        ProductB productB=new ProductB2();
        return productB;
    }
}
