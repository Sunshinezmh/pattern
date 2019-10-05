package creationType.prototypePattern.deep;

import java.io.*;

/**
 * @Classname WeeklyLog
 * @Auther sunshinezhang
 * @Date 2019/9/29 11:13
 */
public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name="张三";
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }
}
