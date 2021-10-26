package com.liepin.rim.org.day03;

import javax.annotation.processing.SupportedSourceVersion;

public class NoVoidReturn {

    public static void noReturn(int score){
        //使用if语句来判断分数区间，打印不同的内容
        if (score > 90) {
            System.out.println("优秀，有你，越来越强大~" + " " + score);
        } else if (score > 70) {
            System.out.println("良好，再接再厉，下次就是优秀了~" + " " + score);
        } else if (score >= 60) {
            System.out.println("及格，不要再玩游戏了，好好学习" + " " + score);
        } else {
            System.out.println("通知家长来吧，下次争取及格~" + " " + score);
        }
        //没有return语句
    }

    public static void main(String[] args){
        noReturn(40);
        noReturn(78);
        noReturn(99);
    }
}
