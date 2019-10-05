package behaviorType.responsibilityPattern;

/**
 * @Classname ConcreteHandler1
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:31
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void HandleRequest(int request) {
        if (request>=0 && request<10) {
            System.out.println("处理0到10的请求:"+request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
