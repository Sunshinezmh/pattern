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

    public void download(){
        System.out.println("下载附件，文件名为" + name);

    }
}
