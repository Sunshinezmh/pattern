package Test.Flyweight;

/**
 * @Classname ConcreteFlyweight
 * @Auther sunshinezhang
 * @Date 2019/10/1 08:40
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void opertation(int i) {
        System.out.println("具体的共享享元："+i);
    }
}
