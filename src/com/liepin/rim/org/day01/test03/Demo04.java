package com.liepin.rim.org.day01.test03;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    static int[] nums = {3,2,2,3,0,0,8,12,2,3,3,4,5,1};
    static int val = 3;

    public static void main(String[] args){
        Demo04 demo04 = new Demo04();
        demo04.removeElement(nums,val);
    }

    public int removeElement(int[] nums,int val){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int num = list.size();
        for (int i = 0; i < num; i++) {
            if (list.get(i) == val){
                list.remove(i);
                num = num -1;
                if (i == 0){
                    i = -1;
                }else {
                    i--;
                }
            }
        }

        System.out.println(list);
        System.out.println("删除后的数组长度为: " + num);
        return num;
    }
}
