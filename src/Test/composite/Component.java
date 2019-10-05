package Test.composite;

/**
 * @Classname Component
 * @Auther sunshinezhang
 * @Date 2019/10/1 10:45
 */
public abstract class Component {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component component);
    public abstract void Remove(Component component);
    public abstract void Display(int i);
}
