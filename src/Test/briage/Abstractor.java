package Test.briage;

/**
 * @Classname Abstractor
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:27
 */
public abstract class Abstractor {
    protected Implenentor implenentor;

    public Abstractor(Implenentor implenentor) {
        this.implenentor = implenentor;
    }

    public abstract void opeationImpl();
}
