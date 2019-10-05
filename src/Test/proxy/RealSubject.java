package Test.proxy;

/**
 * @Classname RealSubject
 * @Auther sunshinezhang
 * @Date 2019/10/1 09:25
 */
public class RealSubject extends Subject {
    @Override
    public void Request() {
        System.out.println("我要去天安门");
    }
}
