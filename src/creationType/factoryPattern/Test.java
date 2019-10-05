package creationType.factoryPattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/27 16:23
 */
public class Test {

    public static void main(String[] args) {
        String path = "/Users/sunshinezhang/Documents/Team3/DesignPatterns/code/pattern/src/config/config.xml";
        String tagName = "className";
        //Factory factory = (Factory) XMLUtil.getBean(path,tagName);
        Factory factory=new AddFactory();
        Operation operation=factory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result=operation.getResult();
        System.out.println(result);
    }

}
