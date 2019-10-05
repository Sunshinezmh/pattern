package Test.builder;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 17:30
 */
public class Test {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        director.Conctor();
        Product product=builder.getResult();
        product.show();
    }



}
