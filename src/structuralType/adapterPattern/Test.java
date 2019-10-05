package structuralType.adapterPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:35
 */
public class Test {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.Request();
    }
}
