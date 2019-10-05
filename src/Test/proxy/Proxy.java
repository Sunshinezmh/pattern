package Test.proxy;

/**
 * @Classname Proxy
 * @Auther sunshinezhang
 * @Date 2019/10/1 09:25
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        System.out.println("大家代替我去天安门");
        realSubject.Request();
    }
}
