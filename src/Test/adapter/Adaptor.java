package Test.adapter;

/**
 * @Classname Adaptor
 * @Auther sunshinezhang
 * @Date 2019/10/1 09:29
 */
public class Adaptor extends Subject {
    private Adaptee adaptee=new Adaptee();
    @Override
    public void Request() {
        System.out.println("电压转换");
        adaptee.GoodRequest();
    }
}
