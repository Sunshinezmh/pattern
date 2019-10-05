package behaviorType.commandPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:20
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        AbsReceiver receiver=new Receiver();
        AbsReceiver receiver1=new Receiver1();
        Command command = new ConcreteCommand(receiver);

        invoker.setCommand(command);
        invoker.ExcuteCommand();

        command.setReceiver(receiver1);
        invoker.ExcuteCommand();
    }
}
