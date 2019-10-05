package behaviorType.responsibilityPattern;

/**
 * @Classname Handler
 * @Auther sunshinezhang
 * @Date 2019/10/1 15:29
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}
