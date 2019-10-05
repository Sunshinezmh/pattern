package Test.templateMethod;

/**
 * @Classname AbstractClass
 * @Auther sunshinezhang
 * @Date 2019/10/2 16:45
 */
public abstract class AbstractClass {
   public abstract void showA();
   public abstract void showB();
   public void primitiveOperation(){}

   public boolean isPrint(){
       return true;
   }

    public void TemplateMethod(){
        showA();
        showB();
        if (isPrint()) {
            primitiveOperation();
        }
    }
}
