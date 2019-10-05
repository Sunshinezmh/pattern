package Test.decortor;

/**
 * @Classname concreteComponent
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:47
 */
public class ConcreteComponent extends Component {
    @Override
    public void Opation() {
        System.out.println("具体装饰的对象");
    }
}
