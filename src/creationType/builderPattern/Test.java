package creationType.builderPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/27 14:59
 */
public class Test {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder=new ConcreteBuilder();
        Director director=new Director(concreteBuilder);

        director.constract();
        Product product=concreteBuilder.getResult();
        product.show();
    }
}
