package Test.Prototype.deep;

import java.io.Serializable;

/**
 * @Classname Attachment
 * @Auther sunshinezhang
 * @Date 2019/9/29 20:32
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
