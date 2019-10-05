package structuralType.decoratorPattern;

/**
 * @Classname Decorator
 * @Auther sunshinezhang
 * @Date 2019/9/30 11:48
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (this.component != null) {
            this.component.Operation();
        }
    }
}
