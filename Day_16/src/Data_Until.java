import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Data_Until {
    private static String getPattern(String pattern,Date date) {
        return new SimpleDateFormat(pattern).format(date);
    }
    public static String getSystemDate(Date date) {
        return getPattern("yyyy-MM-dd",date);
    }
    public static String getDefaultDate(Date date) {
        return getPattern("yyyy年MM月dd日",date);
    }
    public static String get24h(Date date) {
        return getPattern("HH:mm:ss",date);
    }
    public static String get12h(Date date) {
        return getPattern("hh:mm:ss",date);
    }
    public static String getDateTime(Date date) {
        return getPattern("yyyy-MM-dd HH:mm:ss",date);
    }
    public static String getDeafultDate(Date date) {
        return getPattern("yyyy年MM月dd日HH:mm:ss",date);
    }
    public static String getWeekDay(Date date) {
        return getPattern("E",date).replace("周","星期");
    }
    public static Date parse(String date,String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(date);
    }
}
