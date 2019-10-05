package creationType.builderPattern;


/**
 * @Classname Director
 * @Auther sunshinezhang
 * @Date 2019/9/27 14:57
 */
public class Director {


    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void constract(){
        this.builder.buildPartA();
        this.builder.buildPartB();
    }

}
