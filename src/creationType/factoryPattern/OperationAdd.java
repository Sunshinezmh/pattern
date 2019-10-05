package creationType.factoryPattern;

/**
 * @Classname OperationAdd
 * @Auther sunshinezhang
 * @Date 2019/9/27 16:16
 */
public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return this.getNumberA()+this.getNumberB();
    }

}
