package behaviorType.mementoPattern;

import java.util.HashMap;

/**
 * 管理者
 * @Classname Caretaker
 * @Auther sunshinezhang
 * @Date 2019/10/1 18:13
 */
public class Caretaker {
    private HashMap<Integer,Memento> mementoHashMap=new HashMap<>();
    int t;

    //得到或设置备忘录
    public Memento getMemento(Integer key) {
        return mementoHashMap.get(key);
    }

    public void setMemento(Memento memento) {
        mementoHashMap.put(t++,memento);
    }
}
