package creationType.factoryPattern;

/**
 * @Classname OperationSub
 * @Auther sunshinezhang
 * @Date 2019/9/27 16:19
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA()-this.getNumberB();
    }
}
