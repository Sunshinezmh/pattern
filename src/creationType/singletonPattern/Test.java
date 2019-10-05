package creationType.singletonPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/27 19:36
 */
public class Test {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        if (s1==s2) {
            System.out.println("两个对象是相同的实例");
        }
    }
}
