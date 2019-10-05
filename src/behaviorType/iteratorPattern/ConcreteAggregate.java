package behaviorType.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的集合类
 * @Classname ConcreteAggregate
 * @Auther sunshinezhang
 * @Date 2019/10/1 17:43
 */
public class ConcreteAggregate implements Aggregate {
    protected List<Object> list = new ArrayList<>();

    public ConcreteAggregate(){
        list.add("小花");
        list.add("小娜");
        list.add("小红");
    }

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }



}
