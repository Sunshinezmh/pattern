package structuralType.flyweightPattern;

/**
 * @Classname ConcreteFlyweight
 * @Auther sunshinezhang
 * @Date 2019/9/30 10:43
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicatate) {
        System.out.println("共享"+extrinsicatate);
    }
}
