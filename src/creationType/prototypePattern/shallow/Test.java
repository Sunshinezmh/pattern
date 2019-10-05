package creationType.prototypePattern.shallow;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 11:04
 */
public class Test {
    public static void main(String[] args) {
        WeeklyLog log_previous, log_new;
        log_previous=new WeeklyLog();

        Attachment attachment=new Attachment();
        log_previous.setAttachment(attachment);

        log_new=log_previous.clone();
        log_new.getAttachment().setName("李四");


        System.out.println("周报是否相同？"+(log_previous==log_new));
        System.out.println("附件是否相同？"+(log_previous.getAttachment()==log_new.getAttachment()));
        System.out.println("附件是否相同？"+(log_previous.getAttachment().hashCode()+" "+log_new.getAttachment().hashCode()));
        System.out.println("姓名是否相同？"+(log_previous.getName()+"  "+log_new.getName()));
        System.out.println("附件是否相同？"+(log_new.getAttachment().getName()+"  "+log_new.getAttachment().getName()));
        System.out.println("姓名是否相同？"+(log_previous.getName().hashCode()+"  "+log_new.getName().hashCode()));

    }
}
