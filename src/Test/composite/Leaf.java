package Test.composite;

/**
 * @Classname Leaf
 * @Auther sunshinezhang
 * @Date 2019/10/1 11:00
 */
public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        System.out.println("添加叶子");
    }

    @Override
    public void Remove(Component component) {
        System.out.println("移除叶子");
    }

    @Override
    public void Display(int i) {
        System.out.println(new String("-")+new String(String.valueOf(i))+name);
    }
}
