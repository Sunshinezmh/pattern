package behaviorType.mediatorPattern;

/**
 * @Classname ConcreteColleague2
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:30
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message, this);
    }

    @Override
    public void Receive(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
