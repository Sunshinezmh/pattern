package Test.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Context
 * @Auther sunshinezhang
 * @Date 2019/10/2 17:19
 */
public class Context {
    private HashMap<String,Strategy> strategies=new HashMap<>();


    public void setStrategies(String key, Strategy strategy) {
        strategies.put(key, strategy);
    }


    public void handler(String key){
        this.strategies.get(key).Request();
    }
}
