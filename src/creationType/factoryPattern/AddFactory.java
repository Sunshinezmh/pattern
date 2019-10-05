package creationType.factoryPattern;

/**
 * @Classname FactoryA
 * @Auther sunshinezhang
 * @Date 2019/9/27 16:05
 */
public class AddFactory extends Factory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
