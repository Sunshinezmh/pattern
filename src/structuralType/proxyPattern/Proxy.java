package structuralType.proxyPattern;

/**
 * @Classname Proxy
 * @Auther sunshinezhang
 * @Date 2019/9/30 12:04
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        System.out.println("文文代替明慧给李娜送花");
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        realSubject.Request();
    }
}
