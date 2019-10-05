package Test.briage;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:34
 */
public class Test {
    public static void main(String[] args) {
        Implenentor implenentor=new RedImplenentor();
        Implenentor implenentor1=new BlueImplenentor();

        Abstractor abstractor=new RefinedAbstractor(implenentor);
        Abstractor abstractor1=new RefinedAbstractor(implenentor1);

        abstractor.opeationImpl();
        abstractor1.opeationImpl();
    }
}
