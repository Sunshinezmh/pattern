package creationType.factoryPattern;

/**
 * @Classname SubFactory
 * @Auther sunshinezhang
 * @Date 2019/9/27 16:15
 */
public class SubFactory extends Factory{

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
