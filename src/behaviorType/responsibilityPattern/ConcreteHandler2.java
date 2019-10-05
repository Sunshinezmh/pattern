package behaviorType.responsibilityPattern;

/**
 * @Classname ConcreteHandler2
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:28
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if (request >=10 && request<20) {
            System.out.println("处理10到20的请求:"+request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
