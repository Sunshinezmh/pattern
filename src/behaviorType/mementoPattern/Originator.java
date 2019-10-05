package behaviorType.mementoPattern;

import org.jetbrains.annotations.NotNull;

/**
 * 发起人（游戏）
 * @Classname Caretaker
 * @Auther sunshinezhang
 * @Date 2019/10/1 18:08
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录Memento
    public Memento createMemento(){
        return new Memento(state);
    }

    //恢复备忘录的内部状态
    public void restorMemento(Memento memento){
        if (memento != null) {
            state=memento.getState();
        }
    }

    //显示备忘录的状态
    public void show(){
        System.out.println("显示状态state:  "+state);
    }
}
