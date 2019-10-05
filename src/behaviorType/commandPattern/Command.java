package behaviorType.commandPattern;

/**
 * @Classname Command
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:17
 */
public abstract class Command {
    protected AbsReceiver receiver;

    public void setReceiver(AbsReceiver receiver) {
        this.receiver = receiver;
    }

    public Command(AbsReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void Excute();
}
