package behaviorType.iteratorPattern;

/**
 * 迭代抽象类
 * @Classname Iterator
 * @Auther sunshinezhang
 * @Date 2019/10/1 17:40
 */
public interface Iterator {
    Object First();
    Object Next();
    boolean IsDone();
    Object CurrentItem();
}
