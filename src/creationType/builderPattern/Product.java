package creationType.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Product
 * @Auther sunshinezhang
 * @Date 2019/9/27 14:59
 */
public class Product {
    List<String> list = new ArrayList<>();

    public void addPart(String part){
        list.add(part);
    }

    public void show(){
        for (String s : list) {
            System.out.println("产品每一部分的组件为："+s);
        }
    }

}
