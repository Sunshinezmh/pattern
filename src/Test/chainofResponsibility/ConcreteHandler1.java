package Test.chainofResponsibility;

/**
 * @Classname ConcreteHandler1
 * @Auther sunshinezhang
 * @Date 2019/10/2 15:44
 */
public class ConcreteHandler1 extends Handler {


    @Override
    public void Request(int i) {
        if (i>=0 && i<10) {
            System.out.println(this.getClass().getSimpleName()+"处理该请求"+i);
        }else if(successor != null){
            successor.Request(i);
        }
    }
}
