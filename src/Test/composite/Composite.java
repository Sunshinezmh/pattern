package Test.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Composite
 * @Auther sunshinezhang
 * @Date 2019/10/1 11:03
 */
public class Composite extends Component {
    private List<Component> list=new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        list.add(component);
    }

    @Override
    public void Remove(Component component) {
        list.remove(component);
    }

    @Override
    public void Display(int i) {
        System.out.println(new String("-")+new String(String.valueOf(i))+name);

        list.forEach(component -> component.Display(i+1));
    }
}
