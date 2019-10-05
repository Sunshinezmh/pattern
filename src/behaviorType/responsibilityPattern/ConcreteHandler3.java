package behaviorType.responsibilityPattern;

/**
 * @Classname ConcreteHandler3
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:32
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if (request >=20 && request<30) {
            System.out.println("处理20到30的请求:"+request);
        }else if(successor !=null){
            successor.HandleRequest(request);
        }
    }
}
