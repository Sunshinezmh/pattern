package Test.chainofResponsibility;

/**
 * @Classname Handler
 * @Auther sunshinezhang
 * @Date 2019/10/2 15:43
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void Request(int i);
}

