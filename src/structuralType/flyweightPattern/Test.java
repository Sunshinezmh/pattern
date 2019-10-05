package structuralType.flyweightPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 10:46
 */
public class Test {
    public static void main(String[] args) {
        int extrinsicatate=22;
        FlyweightFactory flyweightFactory=new FlyweightFactory();

        Flyweight flyweight=flyweightFactory.GetFlyweight("X");
        flyweight.Operation(--extrinsicatate);

        Flyweight flyweight1=flyweightFactory.GetFlyweight("Y");
        flyweight1.Operation(--extrinsicatate);

        Flyweight flyweight2=flyweightFactory.GetFlyweight("Z");
        flyweight2.Operation(--extrinsicatate);

        Flyweight unflyshared=new UnsharedConcreteFlyweight();
        unflyshared.Operation(--extrinsicatate);

    }

}
