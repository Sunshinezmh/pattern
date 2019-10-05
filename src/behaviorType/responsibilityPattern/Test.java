package behaviorType.responsibilityPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:33
 */
public class Test {
    public static void main(String[] args) {
        Handler h1=new ConcreteHandler1();
        Handler h2=new ConcreteHandler2();
        Handler h3=new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 33, 18, 3, 27, 70};
        for (int request : requests) {
            h1.HandleRequest(request);
        }
    }
}
