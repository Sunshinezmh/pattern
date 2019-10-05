package behaviorType.mediatorPattern;

/**
 * @Classname ConcreteMediator
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:27
 */
public class ConcreteMediator extends Mediator {
    public ConcreteColleague1 concreteColleague1;
    public ConcreteColleague2 concreteColleague2;


    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }


    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void Send(String message,Colleague colleague) {
        if (colleague==concreteColleague1) {
            concreteColleague2.Receive(message);
        }else{
            concreteColleague1.Receive(message);
        }
    }
}
