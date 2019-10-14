package creationType.prototypePattern.deep;

import java.io.Serializable;

/**
 * 附件
 * @Classname Attachment
 * @Auther sunshinezhang
 * @Date 2019/9/29 11:10
 */
public class Attachment implements Serializable {
    private String name="张三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
