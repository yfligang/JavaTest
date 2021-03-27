package com.liepin.rim.org.day01.test05;

public enum Account {
    NORMAL("普通账户",10000L),VIP_personal("个人VIP",100001L);

    private String name;
    private Long usereId;

    private Account(String name, long usereId) {

    }
}
