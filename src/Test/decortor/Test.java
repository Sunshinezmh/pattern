package Test.decortor;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:50
 */
public class Test {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component.Opation();

        AComponent aComponent=new AComponent1();
        AComponent aComponent1=new AComponent2();

        System.out.println("-----------");
        aComponent.setComponent(component);
        aComponent1.setComponent(aComponent);
        aComponent1.Opation();
    }
}
