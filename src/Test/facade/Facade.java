package Test.facade;

/**
 * @Classname Facade
 * @Auther sunshinezhang
 * @Date 2019/10/1 09:18
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
        subSystemOne.MethodOne();
        subSystemTwo.MethodTwo();
        subSystemThree.MethodThree();
    };

    public void MethodB(){
        subSystemTwo.MethodTwo();
    };
}
