package com.guazi.study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTestDemo {

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        int dow = calendar.get(Calendar.DAY_OF_WEEK);
        int dom = calendar.get(Calendar.DAY_OF_MONTH);
        int doy = calendar.get(Calendar.DAY_OF_YEAR);

        System.out.println("当前时间: " + calendar.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);
        System.out.println("一个月中的第几天: " + dom);
        System.out.println("一年中的第几天: " + doy);
    }
}

class TimeZoneDemo{
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis(); //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        //时间戳转换成时间
        System.out.println("格式化结果: " + sd);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd2);


    }
}
