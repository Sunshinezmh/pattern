package creationType.builderPattern;

/**
 * @Classname CreatorBuilder
 * @Auther sunshinezhang
 * @Date 2019/9/27 14:59
 */
public class ConcreteBuilder extends Builder {
    Product product=new Product();

    @Override
    public void buildPartA() {
        product.addPart("添加组件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("添加组件B");

    }

    @Override
    public Product getResult() {
        return product;
    }
}
