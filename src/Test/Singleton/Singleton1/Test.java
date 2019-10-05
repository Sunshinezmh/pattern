package Test.Singleton.Singleton1;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 16:07
 */
public class Test {
    public static void main(String[] args) {
      Singleton singleton=Singleton.getInstance();
      Singleton singleton1=Singleton.getInstance();

        if (singleton==singleton1) {
            System.out.println("值相等");
        }
    }
}
