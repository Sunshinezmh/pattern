package Test.builder;

/**
 * @Classname Director
 * @Auther sunshinezhang
 * @Date 2019/9/29 17:28
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder=builder;
    }

    public void Conctor(){
        builder.buildPartA();
        builder.buildPartB();
    }
}
