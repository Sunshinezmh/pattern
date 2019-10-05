package structuralType.proxyPattern;

/**
 * @Classname RealSubject
 * @Auther sunshinezhang
 * @Date 2019/9/30 12:04
 */
public class RealSubject extends Subject {
    @Override
    public void Request() {
        System.out.println("我要给李娜送花");
    }
}
