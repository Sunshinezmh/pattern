package creationType.prototypePattern.shallow;

/**
 * @Classname WeeklyLog
 * @Auther sunshinezhang
 * @Date 2019/9/29 11:00
 */
public class WeeklyLog implements Cloneable {
    private Attachment attachment;
    private String name="张三";
    private String date;
    private int content=1;


    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

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



    public WeeklyLog clone(){
        Object obj= null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
            return null;
        }
    }

}
