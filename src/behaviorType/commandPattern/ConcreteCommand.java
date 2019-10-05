package behaviorType.commandPattern;

/**
 * @Classname ConcreteCommand
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:18
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(AbsReceiver receiver) {
        super(receiver);
    }

    @Override
    public void Excute() {
        receiver.Action();
    }
}
