package Test.facade;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 09:23
 */
public class Test {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.MethodA();
        System.out.println("__________________");
        facade.MethodB();
    }
}
