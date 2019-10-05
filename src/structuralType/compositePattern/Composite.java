package structuralType.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Composite
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:59
 */
public class Composite extends Component {

    List<Component> componentList=new ArrayList<>();


    public Composite(String name) {
        super(name);
    }


    @Override
    public void Add(Component component) {
        componentList.add(component);
    }

    @Override
    public void Remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void Display(int depth) {
        System.out.println(new String("-")+new String(String.valueOf(depth))+name);
        componentList.forEach(component -> component.Display(depth+2));
    }

}
