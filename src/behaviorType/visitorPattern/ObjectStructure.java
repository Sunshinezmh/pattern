package behaviorType.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ObjectStructure
 * @Auther sunshinezhang
 * @Date 2019/10/1 20:52
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public void Accept(Visitor visitor){
        for (Element element : elements) {
            element.Accept(visitor);
        }
    }
}

