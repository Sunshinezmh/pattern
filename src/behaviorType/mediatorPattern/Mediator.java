package behaviorType.mediatorPattern;

/**
 * @Classname Mediator
 * @Auther sunshinezhang
 * @Date 2019/10/1 16:24
 */
public abstract class Mediator {
    public abstract void Send(String message,Colleague colleague);
}
