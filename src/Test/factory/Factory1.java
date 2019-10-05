package Test.factory;

/**
 * @Classname Factory1
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:33
 */
public class Factory1 extends Factory {
    @Override
    public Product createProduct() {
        Product product=new ProductA();
        return product;
    }
}
