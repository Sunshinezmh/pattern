package behaviorType.mediatorPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:40
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();

        ConcreteColleague1 colleague = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague1 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague);
        mediator.setConcreteColleague2(colleague1);
        colleague.Send("吃过饭了吗");
        colleague1.Send("没有呢，你打算请客");
    }
}
