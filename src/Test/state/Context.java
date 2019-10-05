package Test.state;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Context
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:37
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态"+state.getClass().getTypeName());
    }


    public void Request(){
       state.showState(this);
    }
}

