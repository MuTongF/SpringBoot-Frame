package com.mutong.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/*时间工具类*/
public class TimeUtil {

    /**
     * 获取String类型的时间字符串
     * @param date  date对象
     * @param format    格式:yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String GetStringDate(Date date,String... format){
        String s = "";
        if(format.length==0){
            s = "yyyy-MM-dd HH:mm:ss";
        }else {
            s = format[0];
        }
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(s);
        return simpleDateFormat.format(date);
    }

    /**
     * 获取之后多少分钟的时间
     * @param mintures
     * @return
     */
    public static Date getLastMintruesDate(Date date,Integer mintures){
        long l = date.getTime() + (mintures * 1000 * 60);
        return new Date(l);
    }

    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(GetStringDate(date,"yyyy-MM-dd HH:mm:ss"));
//        System.out.println(GetStringDate(getLastMintruesDate(date,2),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(GetStringDate(date));
    }
}
