package Test.briage;

/**
 * @Classname RefinedAbstractor
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:32
 */
public class RefinedAbstractor extends Abstractor {
    public RefinedAbstractor(Implenentor implenentor) {
        super(implenentor);
    }

    @Override
    public void opeationImpl() {
        super.implenentor.optation();
    }
}
