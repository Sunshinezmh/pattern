package behaviorType.commandPattern;

/**
 * @Classname Invoker
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:19
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ExcuteCommand(){
        command.Excute();
    }
}
