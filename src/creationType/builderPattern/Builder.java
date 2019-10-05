package creationType.builderPattern;

/**
 * 创建者
 * @Classname Builder
 * @Auther sunshinezhang
 * @Date 2019/9/27 14:58
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();

}
