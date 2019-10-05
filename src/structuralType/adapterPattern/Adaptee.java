package structuralType.adapterPattern;

/**
 * 源接口
 * @Classname Adaptee
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:30
 */
public class Adaptee {
    public void SpecificRequest(){
        System.out.println("实际使用的电压：插排的电压:220V");
    }
}
