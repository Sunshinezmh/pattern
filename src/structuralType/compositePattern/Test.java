package structuralType.compositePattern;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/30 10:02
 */
public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("我是树根");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Composite comp = new Composite("我是树枝A");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);

        Composite compB = new Composite("我是树枝B");
        compB.Add(new Leaf("Leaf XA1"));
        compB.Add(new Leaf("Leaf XB2"));
        comp.Add(compB);


        root.Add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.Remove(leaf);

        root.Display(1);
    }
}
