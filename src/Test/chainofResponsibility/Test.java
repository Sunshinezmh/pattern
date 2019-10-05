package Test.chainofResponsibility;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/2 15:48
 */
public class Test {
    public static void main(String[] args) {
        Handler handler=new ConcreteHandler1();
        Handler handler1=new ConcreteHandler2();
        Handler handler2=new ConcreteHandler3();
        handler.setSuccessor(handler1);
        handler1.setSuccessor(handler2);

        int[] ints={10,20,30,7,8,2,14,25};

        for (int anInt : ints) {
            handler.Request(anInt);
        }

    }
}
