package Test.composite;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/10/1 11:04
 */
public class Test {
    public static void main(String[] args) {
        Component root = new Composite("根节点");
        Component composite1 = new Composite("分枝1");
        Component leaf1 = new Leaf("叶子1");
        Component leaf2 = new Leaf("叶子2");
        root.Add(composite1);
        root.Add(leaf1);
        root.Add(leaf2);


        Component component = new Composite("分枝2");
        Component leaf3 = new Leaf("叶子3");
        Component leaf4 = new Leaf("叶子4");
        component.Add(leaf3);
        component.Add(leaf4);

        root.Add(component);

        Component leaf = new Leaf("叶子5");
        root.Add(leaf);

        Component leaf5 = new Leaf("叶子6");
        root.Remove(leaf5);

        root.Display(1);
    }
}
