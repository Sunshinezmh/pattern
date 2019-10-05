package Test.decortor;

/**
 * @Classname AComponent
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:48
 */
public class AComponent extends Component {

    private Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Opation() {
        component.Opation();
    }
}
