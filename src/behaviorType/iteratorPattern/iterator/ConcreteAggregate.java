package behaviorType.iteratorPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ConcreteAggregate
 * @Auther sunshinezhang
 * @Date 2019/10/1 22:07
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate(){
        list.add("小花");
        list.add("小娜");
        list.add("小红");
    }

    @Override
    public Iterator CreateIterator() {
        return new Iterator() {

            private int current=0;

            @Override
            public Object First() {
                return list.get(0);
            }

            @Override
            public Object Next() {
                Object ret = null;
                current++;
                if(current <list.size()){
                    ret = list.get(current);
                }
                return ret;
            }

            @Override
            public boolean IsDone() {
                return current >= list.size()?true:false;

            }

            @Override
            public Object CurrentItem() {
                return list.get(current);
            }
        };
    }
}
