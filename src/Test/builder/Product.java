package Test.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Product
 * @Auther sunshinezhang
 * @Date 2019/9/29 17:24
 */
public class Product {
    List<String> list = new ArrayList<>();

    public void add(String part){
        list.add(part);
    }

    public void show(){
        for (String s : list) {
            System.out.println("显示每个组件s:"+s);
        }
    }
}
