package behaviorType.statePattern;

/**
 * @Classname Context
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:13
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }


    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态"+state.getClass().getTypeName());
    }

    public void Request(){
        state.Handle(this);
    }
}
