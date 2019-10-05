package creationType.singletonPattern;

/**
 * @Classname Singleton
 * @Auther sunshinezhang
 * @Date 2019/9/27 19:33
 */
public class Singleton {

    private static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance=new Singleton();
        }
        return instance;
    }




}
