package behaviorType.mediatorPattern;

/**
 * @Classname ConcreteColleague1
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:28
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message, this);
    }

    @Override
    public void Receive(String message) {
        System.out.println("同事1得到消息：" + message);
    }

}
