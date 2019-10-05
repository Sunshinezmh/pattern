package behaviorType.iteratorPattern.iterator;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 22:13
 */
public class Test {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        Iterator iterator = aggregate.CreateIterator();
        while (!iterator.IsDone()) {
            System.out.println("请买车票:" + iterator.CurrentItem());
            iterator.Next();
        }
    }
}
