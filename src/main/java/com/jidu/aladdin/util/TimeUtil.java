package com.jidu.aladdin.util;

import org.springframework.beans.factory.annotation.Autowired;

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
    public static String GetStringDate(Date date,String format){
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(GetStringDate(date,"yyyy-MM-dd HH:mm:ss"));
    }
}
