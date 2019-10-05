package structuralType.flyweightPattern;

import java.util.HashMap;

/**
 * @Classname FlyweightFactory
 * @Auther sunshinezhang
 * @Date 2019/9/30 10:44
 */
public class FlyweightFactory  {
    private HashMap<String,Object>  flyweights=new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight GetFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }
}
