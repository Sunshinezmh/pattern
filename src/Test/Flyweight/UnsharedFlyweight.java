package Test.Flyweight;

/**
 * @Classname UnsharedFlyweight
 * @Auther sunshinezhang
 * @Date 2019/10/1 08:41
 */
public class UnsharedFlyweight extends Flyweight {
    @Override
    public void opertation(int i) {
        System.out.println("不共享的享元："+i);
    }
}
