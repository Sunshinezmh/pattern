package structuralType.proxyPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 12:06
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new Proxy();
        subject.Request();
    }
}
