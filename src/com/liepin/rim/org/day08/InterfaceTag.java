package com.liepin.rim.org.day08;

public interface InterfaceTag {
    boolean filter(String str);

    default String getInfo(){
        return "返回函数";
    }
}
