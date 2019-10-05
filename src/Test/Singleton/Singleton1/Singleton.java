package Test.Singleton.Singleton1;

/**
 * @Classname Singleton
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:06
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

}
