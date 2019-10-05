package Test.Flyweight;

import java.util.HashMap;

/**
 * @Classname FlyweightFacatory
 * @Auther sunshinezhang
 * @Date 2019/10/1 08:42
 */
public class FlyweightFacatory {
    private HashMap<String, Object> hashMap = new HashMap<>();

    public FlyweightFacatory() {
        hashMap.put("X", new ConcreteFlyweight());
        hashMap.put("Y", new ConcreteFlyweight());
        hashMap.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyWeight(String key){
        return (Flyweight) hashMap.get(key);
    }


}
