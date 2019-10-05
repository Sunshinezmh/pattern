package behaviorType.iteratorPattern;

/**
 * 具体迭代器类
 * @Classname ConcreteIterator
 * @Auther sunshinezhang
 * @Date 2019/10/1 17:43
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;

    private int current=0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object First() {
        return concreteAggregate.list.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if(current <concreteAggregate.list.size()){
            ret = concreteAggregate.list.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current >= concreteAggregate.list.size()?true:false;
    }

    @Override
    public Object CurrentItem() {
        return concreteAggregate.list.get(current);
    }
}
