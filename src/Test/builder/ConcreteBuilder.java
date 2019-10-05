package Test.builder;

/**
 * @Classname ConcreteBuilder
 * @Auther sunshinezhang
 * @Date 2019/9/29 17:27
 */
public class ConcreteBuilder extends Builder {
    Product product=new Product();

    @Override
    public void buildPartA() {
        product.add("添加组件A");
    }

    @Override
    public void buildPartB() {
        product.add("添加组件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
