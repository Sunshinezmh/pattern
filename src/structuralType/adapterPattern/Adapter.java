package structuralType.adapterPattern;

/**
 * 适配器
 * @Classname Adapter
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:29
 */
public class Adapter extends Target {
    private Adaptee adaptee=new Adaptee();

    @Override
    public void Request(){
        System.out.println("适配器：要把220V电压转换为5V电压");
        adaptee.SpecificRequest();
    }

}
