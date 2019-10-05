package structuralType.facadePattern;

/**
 * @Classname Facade
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:08
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
    }

    public void MethodA(){
        System.out.println("方法组A");
        subSystemOne.MethodOne();
        subSystemTwo.MethodTwo();
        subSystemThree.MethodThree();
    }

    public void MethodB(){
        System.out.println("方法组B");
        subSystemOne.MethodOne();
        subSystemThree.MethodThree();
    }


}
