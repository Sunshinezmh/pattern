package Test.Flyweight;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 08:43
 */
public class Test {
    public static void main(String[] args) {

        int y=9;
        FlyweightFacatory flyweightFacatory = new FlyweightFacatory();


        Flyweight x = flyweightFacatory.getFlyWeight("X");
        x.opertation(--y);

        Flyweight x1 = flyweightFacatory.getFlyWeight("Y");
        x1.opertation(--y);


        Flyweight x2 = flyweightFacatory.getFlyWeight("Z");
        x2.opertation(--y);


        Flyweight flyweight=new UnsharedFlyweight();
        flyweight.opertation(--y);
    }
}
