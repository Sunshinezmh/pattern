package structuralType.compositePattern;

/**
 * @Classname Leaf
 * @Auther sunshinezhang
 * @Date 2019/9/30 09:55
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        System.out.println("Cannot add a leaf");
    }

    @Override
    public void Remove(Component component) {
        System.out.println("Cannot remove a leaf");

    }

    @Override
    public void Display(int depth) {
        System.out.println(new String("-")+new String(String.valueOf(depth))+name);
    }
}
