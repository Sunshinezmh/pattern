package behaviorType.mementoPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 18:15
 */
public class Test {
    public static void main(String[] args) {
        //发起人（游戏）：初始状态为On
        Originator originator = new Originator();
        //管理者
        Caretaker caretaker=new Caretaker();


        originator.setState("On");
        originator.show();
        //第一次备份 "On"
        caretaker.setMemento(originator.createMemento());


        originator.setState("Off");
        originator.show();
        //第二次备份 "Off"
        caretaker.setMemento(originator.createMemento());


        originator.setState("Off1");
        originator.show();
        //第三次备份 "Off1"
        caretaker.setMemento(originator.createMemento());


        originator.setState("Off2");
        originator.show();
        //第四次备份 "Off2"
        caretaker.setMemento(originator.createMemento());


        originator.setState("Off3");
        originator.show();
        //第五次备份 "Off3"
        caretaker.setMemento(null);

        //恢复初始状态
        originator.restorMemento(caretaker.getMemento(4));
        originator.show();

    }
}
