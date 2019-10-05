package Test.factory;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:34
 */
public class Test {
    public static void main(String[] args) {
        Factory factory=new Factory1();
        Product product=factory.createProduct();
        product.show();
    }
}
