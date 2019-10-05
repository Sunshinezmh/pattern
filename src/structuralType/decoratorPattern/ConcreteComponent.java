package structuralType.decoratorPattern;

/**
 * @Classname ConcreteComponent
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:47
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
