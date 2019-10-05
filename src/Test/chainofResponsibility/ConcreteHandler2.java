package Test.chainofResponsibility;

/**
 * @Classname ConcreteHandler2
 * @Auther sunshinezhang
 * @Date 2019/10/2 15:48
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void Request(int i) {
        if (i>=10 && i<20) {
            System.out.println(this.getClass().getSimpleName()+"处理该请求"+i);
        }else if(successor != null){
            successor.Request(i);
        }
    }
}
