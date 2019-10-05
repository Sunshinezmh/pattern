package behaviorType.iteratorPattern.iterator;

/**
 * @Classname Iterator
 * @Auther sunshinezhang
 * @Date 2019/10/1 22:02
 */
public interface Iterator {
    Object First();
    Object Next();
    boolean IsDone();
    Object CurrentItem();
}
