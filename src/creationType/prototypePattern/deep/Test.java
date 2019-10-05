package creationType.prototypePattern.deep;


import java.io.IOException;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 11:23
 */
public class Test {
    public static void main(String[] args) {
        WeeklyLog log_previous, log_new=null;
        log_previous=new WeeklyLog();

        Attachment attachment=new Attachment();
        log_previous.setAttachment(attachment);

        try {
            log_new=log_previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("克隆失败！");
        }
        log_new.getAttachment().setName("李四");

        System.out.println("周报是否相同？"+(log_previous==log_new));
        System.out.println("附件是否相同？"+(log_previous.getAttachment()==log_new.getAttachment()));
        System.out.println("附件是否相同？"+(log_previous.getAttachment().hashCode()+" "+log_new.getAttachment().hashCode()));
        System.out.println("附件是否相同？"+(log_previous.getAttachment().getName()+"  "+log_new.getAttachment().getName()));


    }
}
