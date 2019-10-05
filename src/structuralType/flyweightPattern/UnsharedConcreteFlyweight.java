package structuralType.flyweightPattern;

/**
 * @Classname UnshatedConcreteFlyweight
 * @Auther sunshinezhang
 * @Date 2019/9/30 10:44
 */
public class UnsharedConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicatate) {
        System.out.println("不共享"+extrinsicatate);
    }
}
