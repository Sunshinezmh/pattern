package behaviorType.mediatorPattern;

/**
 * @Classname Colleague
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:26
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void Send(String message);
    public abstract void Receive(String message);

}
