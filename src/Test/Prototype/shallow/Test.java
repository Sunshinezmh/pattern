package Test.Prototype.shallow;

/**
 * @Classname Test
 * @Auther sunshinezhang
 * @Date 2019/9/29 20:45
 */
public class Test {
    public static void main(String[] args) {
        WeeklyLog weeklyLog,newWeeklyLog;
        Attachment attachment=new Attachment();
        weeklyLog=new WeeklyLog();
        weeklyLog.setAttachment(attachment);
        newWeeklyLog=weeklyLog.clone();

        System.out.println(weeklyLog==newWeeklyLog);
        System.out.println(weeklyLog.getAttachment()==newWeeklyLog.getAttachment());
    }
}
