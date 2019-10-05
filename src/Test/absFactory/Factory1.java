package Test.absFactory;

/**
 * @Classname Factory1
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:33
 */
public class Factory1 extends Factory {


    @Override
    public ProductA createProductA() {
        ProductA productA=new ProductA1();
        return productA;
    }

    @Override
    public ProductB createProductB() {
        ProductB productB=new ProductB1();
        return productB;
    }
}
