package behaviorType.iteratorPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 17:58
 */
public class Test {
    //需要再次理解
    public static void main(String[] args) {
        ConcreteAggregate aggregate=new ConcreteAggregate();
        Iterator iterator=aggregate.CreateIterator();

        while (!iterator.IsDone()) {
            System.out.println("请买车票:"+iterator.CurrentItem());
            iterator.Next();
        }

    }
}
