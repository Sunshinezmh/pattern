package behaviorType.visitorPattern;

/**
 * 元素
 * @Classname Element
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:46
 */
public abstract class Element {
    //元素接收的访问者
    public abstract void Accept(Visitor visitor);
}
