package Test.Singleton;

/**
 * @Classname Singleton
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:06
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance.equals(null)) {
            instance=new Singleton();
        }
        return instance;
    }
}
